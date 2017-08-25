package com.vd5.dcs;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.SelfSignedCertificate;
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
    private int port;
    private String address;

    private AbstractBootstrap bootstrap;
    private String protocol;

    private ChannelInitializer channelInitializer;

    public TrackerServer(AbstractBootstrap bootstrap, String protocol) {
        this.bootstrap = bootstrap;
        this.protocol = protocol;

        //this.port = RTConfig.getInt()''
        //this.address = RTConfig.getString();
    }

    public void start() throws Exception {
        log.info("...starting server");
        InetSocketAddress enpoint;
        enpoint = address != null ? new InetSocketAddress(address, port) : new InetSocketAddress(port);

        ChannelFuture channelFuture = null;
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();
        if (bootstrap instanceof ServerBootstrap) {
            try {
                ServerBootstrap tcpServerBootstrap = (ServerBootstrap) bootstrap;
                tcpServerBootstrap.group(boss, worker)
                        .channel(NioServerSocketChannel.class)
                        .handler(new LoggingHandler(LogLevel.INFO))
                        .childHandler(channelInitializer);
                tcpServerBootstrap.bind(enpoint).sync().channel().closeFuture().sync();
            } finally {
                boss.shutdownGracefully();
                worker.shutdownGracefully();
            }

        } else if (bootstrap instanceof Bootstrap) {
            Bootstrap udpServerBootstrap = (Bootstrap)bootstrap;
            channelFuture =udpServerBootstrap.bind(enpoint);
        }
    }

    public void stop() {

    }
}
