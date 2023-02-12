package com.example.dvcards.model;

import org.springframework.lang.NonNull;

import java.util.UUID;

public record UserInfo(
        @NonNull UUID token
) {
}
