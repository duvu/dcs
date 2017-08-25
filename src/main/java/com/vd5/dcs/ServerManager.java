package com.vd5.dcs;

import com.vd5.dcs.protocol.Xirgo2050;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @author beou on 8/24/17 06:24
 * @version 1.0
 */
@Component
@Slf4j
public class ServerManager {
    List<TrackerServer> serverList = new LinkedList<>();

    public ServerManager() {
        Xirgo2050 xirgo2050 = new Xirgo2050();
        xirgo2050.initTrackerServer(serverList);
    }

    public void start() {
        for (TrackerServer server : serverList) {
            try {
                server.start();
            } catch (Exception ex) {
                //handle exception
                log.info("Exception while start server" + server.getProtocol());
            }
        }
    }

    public void stop() {
        for (TrackerServer server : serverList) {
            try {
                server.stop();
            } catch (Exception ex) {
                //handle exception
            }
        }
        //TODO release resource
    }
}
