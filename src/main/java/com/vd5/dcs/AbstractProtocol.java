package com.vd5.dcs;

import lombok.Data;

/**
 * @author beou on 8/25/17 14:41
 * @version 1.0
 */
@Data
public abstract class AbstractProtocol implements Protocol {
    private final String name;

    public AbstractProtocol(String name) {
        this.name = name;
    }
}
