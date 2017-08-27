package com.vd5.middleware.entity;

import com.vd5.middleware.entity.id.DeviceID;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author beou on 8/25/17 18:19
 * @version 1.0
 */
@Data
@Entity
@IdClass(DeviceID.class)
@Table(name = "Device")
public class Device implements Serializable {
    private static final long serialVersionUID = 6081859541224410930L;

    @Id
    @Column(name = "accountID", length = 32)
    private String accountId;

    @Id
    @Column(name = "deviceID", length = 32)
    private String deviceId;
}
