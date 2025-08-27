package com.budgetingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {

        // Add a message to the model
        String msg = "Hello World!";
        model.addAttribute("message", msg);

        // Add a list to the model
        List<String> l = List.of("a", "b", "c");
        model.addAttribute("list", l);

        return "test";
    }

}
