package com.ceihtel.wuphf.messaging;

import com.ceihtel.wuphf.dto.NotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitNotificationSender implements NotificationSender {
    private final RabbitTemplate rabbitTemplate;

    @Value("${wuphf.exchange.name:wuphf}")
    public String topicExchangeName;

    @Value("${wuphf.routing.key:notification}")
    public String routingKey;

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        log.info(String.format("Sending message to '%s'", notificationRequest.getDestination()));
        rabbitTemplate.convertAndSend(topicExchangeName, routingKey, notificationRequest);
    }
}
