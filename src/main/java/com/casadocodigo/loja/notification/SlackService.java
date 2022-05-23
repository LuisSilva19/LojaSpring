package com.casadocodigo.loja.notification;

import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Async;

import java.io.IOException;

@Slf4j
public class SlackService {
    private final Slack slack = Slack.getInstance();
    private final boolean enabled;
    private final String slackToken;
    private final String defaultChannel;

    public SlackService(boolean enabled, String token, String defaultChannel) {
        this.enabled = enabled;
        this.slackToken = token;
        this.defaultChannel = defaultChannel;
    }

    @Async
    public void send(String message, NotificationType messageType) {
        send(message, defaultChannel, messageType);
    }

    @Async
    public void send(String message, String channelId, NotificationType notificationType) {
        try {
            String formattedMessage = parseMessage(message, notificationType);
            if (!enabled || StringUtils.isBlank(formattedMessage)) return;

            slack.methods(slackToken).chatPostMessage(req -> req
                    .channel(channelId)
                    .text(formattedMessage));
        } catch (IOException | SlackApiException e) {
            log.error(e.getMessage());
        }
    }

    private String parseMessage(String message, NotificationType notificationType) {
        return String.format(notificationType.getTemplate(), message);
    }
}
