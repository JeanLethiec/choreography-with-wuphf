package com.ceihtel.wuphf.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotificationRequest implements Serializable {
    private String content;

    private String destination;
}
