package com.ceihtel.fax.messaging;

import com.ceihtel.wuphf.dto.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationRequestListener {

    @RabbitListener(queues = "fax")
    public void processMessage(NotificationRequest content) {
        log.info(String.format("Sending Fax message with destination '%s' and content '%s'", content.getDestination(), content.getContent()));
    }
}
