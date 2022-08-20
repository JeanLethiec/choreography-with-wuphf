package com.ceihtel.wuphf.controllers;

import com.ceihtel.wuphf.dto.NotificationRequest;
import com.ceihtel.wuphf.messaging.NotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationSender notificationSender;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void sendNotification(@RequestBody NotificationRequest notificationRequest) {
        notificationSender.sendNotification(notificationRequest);
    }
}
