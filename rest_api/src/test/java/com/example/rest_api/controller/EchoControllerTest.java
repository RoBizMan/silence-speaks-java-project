package com.example.rest_api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EchoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEchoGet() throws Exception {
        mockMvc.perform(get("/echo")
                .param("message", "If you see this message, the test is successful."))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("If you see this message, the test is successful."))
                .andExpect(jsonPath("$.timestamp").exists());
    }

    @Test
    public void testEchoPost() throws Exception {
        String jsonContent = "{\"message\":\"If you see this message, the test is passed.\"}";

        mockMvc.perform(post("/echo")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonContent))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("If you see this message, the test is passed."))
                .andExpect(jsonPath("$.timestamp").exists());
    }
}