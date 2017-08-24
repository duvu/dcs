package com.vd5.dcs;

import io.netty.bootstrap.Bootstrap;


/**
 * @author beou on 8/24/17 06:24
 * @version 1.0
 */
public abstract class TrackerServer {
    int port;

    private Bootstrap bootstrap;
    private String protocol;

    public TrackerServer(Bootstrap bootstrap, String protocol) {
        this.bootstrap = bootstrap;
        this.protocol = protocol;
    }
}
