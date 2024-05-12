package com.example.starter.controller;

import com.example.starter.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
    @Autowired
    private StarterService service;

    @GetMapping("/")
    public String welcome(){
        return service.getStarterMessage();
    }

}
