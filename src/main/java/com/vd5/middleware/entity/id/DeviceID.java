package com.vd5.middleware.entity.id;

import lombok.Data;

import java.io.Serializable;

/**
 * @author beou on 8/25/17 18:29
 * @version 1.0
 */
@Data
public class DeviceID implements Serializable {
    private String accountId;
    private String deviceId;
}
