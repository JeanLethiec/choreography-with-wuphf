package com.ceihtel.wuphf.messaging;

import com.ceihtel.wuphf.dto.NotificationRequest;

public interface NotificationSender {
    void sendNotification(NotificationRequest notificationRequest);
}
