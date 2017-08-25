package com.vd5.dcs.protocol;

import com.vd5.dcs.AbstractProtocol;
import com.vd5.dcs.TrackerServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;

import java.util.List;

/**
 * @author beou on 8/25/17 14:44
 * @version 1.0
 */
public class Xirgo2050 extends AbstractProtocol{

    public Xirgo2050() {
        super("Xirgo2050");
    }

    @Override
    public void initTrackerServer(List<TrackerServer> serverList) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        TrackerServer trackerServer = new TrackerServer(serverBootstrap, getName());
        trackerServer.setChannelInitializer(new Xirgo2050ChannelInitializer());
        trackerServer.setPort(33272);
        serverList.add(trackerServer);
    }
}
