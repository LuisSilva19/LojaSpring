package com.casadocodigo.loja.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConditionalOnBean(annotation = EnableSlackNotification.class)
public class SlackConfiguration {

    @Value("${townsq.slack.enabled}")
    private boolean enabled = true;

    @Value("${townsq.slack.token}")
    private String slackToken;

    @Value("${townsq.slack.defaultChannel}")
    private String defaultChannel;

    @Bean
    public SlackService getSlackService() {
        return new SlackService(enabled, slackToken, defaultChannel);
    }

}
