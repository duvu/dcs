package com.vd5.dcs.protocol.tk10x;

import com.vd5.dcs.AbstractProtocol;
import com.vd5.dcs.TrackerServer;

import java.util.List;
import java.util.Map;

/**
 * @author beou on 8/25/17 18:12
 * @version 1.0
 */
public class Tk10x extends AbstractProtocol{

    public Tk10x() {
        super("Tk10x");
    }

    @Override
    public void initTrackerServer(Map<String, TrackerServer> serverMap) {
        //create and put a tracker server to map
    }
}
