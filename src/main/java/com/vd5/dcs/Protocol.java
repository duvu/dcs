package com.vd5.dcs;

import java.util.List;
import java.util.Map;

/**
 * @author beou on 8/25/17 14:38
 * @version 1.0
 */
public interface Protocol {
    String getName();
    String getAddress();
    int getTcpPort();
    int getUdpPort();
    boolean isEnabled();

    void initTrackerServer(Map<String, TrackerServer> serverList);
    //Collection<String> getSupportedTextCommands();
    //void sendTextCommand(String destAddress, Command command);
    //Collection<String> getSupportedDataCommands();
    //void sendDataCommand();
}
