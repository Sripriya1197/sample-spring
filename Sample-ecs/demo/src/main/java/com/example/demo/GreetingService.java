package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String GREETING_MESSAGE = "Hello Everyone from Service! :)";
    public String getGreeting() {
        return GREETING_MESSAGE;;
    }
}
