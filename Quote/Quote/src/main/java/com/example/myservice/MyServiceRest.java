package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.RedirectView;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MyServiceRest {
    
    private List<String> quotes = Arrays.asList(
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "The way to get started is to quit talking and begin doing. - Walt Disney",
            "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
            "If life were predictable it would cease to be life, and be without flavor. - Eleanor Roosevelt",
            "Life is what happens when you're busy making other plans. - John Lennon"
    );

    @GetMapping("/")
    public String redirectToQuote() {
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }
}
