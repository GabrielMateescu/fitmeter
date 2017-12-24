package com.fitmeter.fitmeter.model.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String email, String password) {
        return email.equalsIgnoreCase("fitmeter@test.com")
                && password.equalsIgnoreCase("test");
    }
}
