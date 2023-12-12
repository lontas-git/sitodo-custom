package com.example.sitodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String showMainPage() {
        return "redirect:/list";
    }
}
