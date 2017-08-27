package com.vd5.dcs;

import com.vd5.utils.StringUtils;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author beou on 8/25/17 14:41
 * @version 1.0
 */
@Data
public abstract class AbstractProtocol implements Protocol {
    private String name;
    private int tcpPort;
    private int udpPort;
    private String address;
    private boolean enabled;

    public AbstractProtocol() {
    }

    public AbstractProtocol(String name) {
        this.name = StringUtils.toLowerCase(name);
    }

    @Override
    public abstract void initTrackerServer(Map<String, TrackerServer> serverList);
}
