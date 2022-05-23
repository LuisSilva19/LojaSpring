package com.casadocodigo.loja.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationType {
    ERROR(":skull_and_crossbones: Erro! %s"),
    WARNING(":eyes: Alerta! %s"),
    COMMENT(":speech_balloon: Novo Comentário: %s");
    private final String template;
}