package com.vd5.middleware.entity;

import com.vd5.middleware.entity.id.EventDataID;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author beou on 8/25/17 18:20
 * @version 1.0
 */
@Data
@Entity
@Table(name = "EventData")
@IdClass(EventDataID.class)
public class EventData implements Serializable {

    private static final long serialVersionUID = -5992850908341019992L;

    @Id
    @Column(name = "accoundID", length = 32)
    private String accountId;

    @Id
    @Column(name = "deviceID", length = 32)
    private String deviceId;

    @Id
    @Column(name = "statusCode")
    private Integer statusCode;

    @Id
    @Column(name = "timestamp")
    private Long timestamp;
}
