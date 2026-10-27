package com.senai.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String bemVindo() {
        return "Bem-Vindo!";
    }

    @GetMapping ("/dev")
    public String dev() {
        return "<h1><i>Wan Cesar</red</h1/<i";
    }
}
