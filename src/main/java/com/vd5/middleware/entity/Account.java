package com.vd5.middleware.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author beou on 8/25/17 18:17
 * @version 1.0
 */
@Entity
@Data
@Table(name = "Account")
public class Account implements Serializable{
    private static final long serialVersionUID = -6172120076056626050L;

    @Id
    @Column(name = "accountID", length = 32)
    private String accountId;

    @Column(name = "description")
    private String description;

    @Column(name = "managerID")
    private String managerId;
}
