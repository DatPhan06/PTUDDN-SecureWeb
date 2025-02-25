package com.example.securingweb.controller;

import com.example.securingweb.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password,
                               @RequestParam(required = false) boolean isAdmin) {
        userService.registerUser(username, password, isAdmin);
        return "redirect:/login";
    }
}
