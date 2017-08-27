package com.vd5.middleware.entity.id;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author beou on 8/25/17 18:23
 * @version 1.0
 */
@Data
public class EventDataID implements Serializable {
    private String accountId;
    private String deviceId;
    private int statusCode;
    private Long timestamp;
}
