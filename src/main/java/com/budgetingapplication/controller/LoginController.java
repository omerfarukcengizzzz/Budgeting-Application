package com.budgetingapplication.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
