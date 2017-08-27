package com.vd5.dcs;

import com.vd5.utils.StringUtils;
import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;


/**
 * @author beou on 8/24/17 06:24
 * @version 1.0
 */
@Data
@Slf4j
public class TrackerServer {
    private String name;
    private int port;
    private String address;

    private AbstractBootstrap bootstrap;
    private ChannelInitializer channelInitializer;

    private NioEventLoopGroup commonGroup;
    private NioEventLoopGroup workerGroup;

    public TrackerServer(AbstractBootstrap bootstrap, String name) {
        this.bootstrap = bootstrap;
        this.name = name;
        if (isDuplex()) {
            workerGroup = new NioEventLoopGroup();
        }
        commonGroup = new NioEventLoopGroup();
    }

    private boolean isDuplex() {
        return bootstrap instanceof ServerBootstrap;
    }

    public void start() throws Exception {
        InetSocketAddress enpoint;
        enpoint = StringUtils.isNotEmpty(address) ? new InetSocketAddress(address, port) : new InetSocketAddress(port);
        if (isDuplex()) {
            log.info("...starting tcp-server");

            ServerBootstrap tcpServerBootstrap = (ServerBootstrap) bootstrap;
            tcpServerBootstrap.group(commonGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(channelInitializer);
            tcpServerBootstrap.bind(enpoint).sync().channel();


        } else if (bootstrap instanceof Bootstrap) {
            log.info("...starting udp-server");
            Bootstrap udpServerBootstrap = (Bootstrap)bootstrap;
            udpServerBootstrap.group(commonGroup)
                    .channel(NioDatagramChannel.class)
                    .handler(channelInitializer);
            udpServerBootstrap.bind(enpoint).sync().channel();
        }
    }

    public void stop() {
        if (isDuplex()) {
            commonGroup.shutdownGracefully();
        }
        workerGroup.shutdownGracefully();
    }
}
