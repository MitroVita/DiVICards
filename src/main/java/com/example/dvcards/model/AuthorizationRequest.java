package com.example.dvcards.model;

import org.springframework.lang.NonNull;

import java.nio.charset.StandardCharsets;

public record AuthorizationRequest(
        @NonNull
        String login,
        @NonNull
        String password
) {
}
