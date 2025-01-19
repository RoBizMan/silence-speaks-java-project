package com.example.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EchoController {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    @GetMapping("/echo")
    public Map<String, Object> echoGet(@RequestParam String message) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("timestamp", LocalDateTime.now().format(formatter));
        return response;
    }

    @PostMapping("/echo")
    public Map<String, Object> echoPost(@RequestBody Map<String, String> request) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", request.get("message"));
        response.put("timestamp", LocalDateTime.now().format(formatter));
        return response;
    }
}