package com.ceihtel.wuphf.configuration;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfiguration {
    @Value("${wuphf.exchange.name:wuphf}")
    public String topicExchangeName;

    @Bean
    public TopicExchange topicBindings() {
        return new TopicExchange(topicExchangeName);
    }
}
