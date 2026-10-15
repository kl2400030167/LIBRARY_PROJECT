package com.bank;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/auth/login")
    public String login(@RequestBody LoginRequest request) {

        if (request.username.equals("admin") &&
            request.password.equals("admin123")) {

            return "Login Successful";
        }

        return "Invalid Username or Password";
    }

    static class LoginRequest {
        public String username;
        public String password;
    }
}