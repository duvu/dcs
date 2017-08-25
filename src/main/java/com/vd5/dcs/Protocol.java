package com.vd5.dcs;

import java.util.List;

/**
 * @author beou on 8/25/17 14:38
 * @version 1.0
 */
public interface Protocol {
    String getName();
    void initTrackerServer(List<TrackerServer> serverList);
    //Collection<String> getSupportedTextCommands();
    //void sendTextCommand(String destAddress, Command command);
    //Collection<String> getSupportedDataCommands();
    //void sendDataCommand();
}
