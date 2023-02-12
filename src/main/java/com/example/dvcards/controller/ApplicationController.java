package com.example.dvcards.controller;

import com.example.dvcards.model.UserInfo;
import com.example.dvcards.database.UserRepository;
import com.example.dvcards.model.AuthorizationRequest;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    private final UserRepository userRepository = new UserRepository();
    @PostMapping("/authorization")
    public UserInfo authorization(
            @RequestBody @NonNull AuthorizationRequest authReq
    ) {
        if ((authReq.login().length() > 20) || (authReq.password().length() > 20)) throw new RuntimeException();
        return userRepository.authorization(authReq);
    }
}
