package com.example.starter.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StarterRepository {

    public String getStarterMessage() {
        return "Spring Boot Starter Server";
    }
}
