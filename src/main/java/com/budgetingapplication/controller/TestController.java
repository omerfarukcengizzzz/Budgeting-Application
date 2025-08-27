package com.budgetingapplication.controller;

import com.budgetingapplication.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {

        // Add a message to the model
        String msg = "Hello World!";
        model.addAttribute("message", msg);

        // Add a list to the model
        List<String> list = List.of("a", "b", "c");
        model.addAttribute("letters", list);

        // Add a form object to the model
        model.addAttribute("user", new User());

        return "test";
    }

    // Form submission handler
    @PostMapping("/test")
    public String username(@ModelAttribute("user") User user, Model model) {

        model.addAttribute("message", user.getUsername());

        return "test";
    }

}
