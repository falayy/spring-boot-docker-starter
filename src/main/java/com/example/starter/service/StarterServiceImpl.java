package com.example.starter.service;

import com.example.starter.repository.StarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarterServiceImpl implements StarterService {

    @Autowired
    private StarterRepository repository;

    @Override
    public String getStarterMessage() {
        return repository.getStarterMessage();
    }

}
