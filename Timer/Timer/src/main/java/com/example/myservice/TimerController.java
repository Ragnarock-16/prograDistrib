package com.example.myservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class TimerController {

    @Value("${backEndURL}")
    String backEndURL;

    @GetMapping("/timer")
    public String timer(Model model) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String apiResponse = restTemplate.getForObject(backEndURL, String.class);
            // Add the API response to the model
            model.addAttribute("quote", backEndURL);
        } catch (Exception e) {
            // Handle any exceptions
            model.addAttribute("quote", "Error fetching data from the API: " + e.getMessage());
        }
        return "timer";
    }
}
