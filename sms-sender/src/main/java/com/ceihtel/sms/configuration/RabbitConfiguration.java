package com.ceihtel.sms.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfiguration {
    @Value("${wuphf.exchange.name:wuphf}")
    public String topicExchangeName;

    @Value("${sms.queue.name:sms}")
    public String queueName;

    @Bean
    public Queue smsQueue() {
        return new Queue(queueName, false);
    }

    @Bean
    public Binding smsQueueBindingWithExchange(Queue smsQueue) {
        return BindingBuilder.bind(smsQueue).to(new TopicExchange(topicExchangeName)).with("notification");
    }
}
