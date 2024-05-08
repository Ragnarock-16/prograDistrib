package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.stereotype.Controller;

@Controller
public class MyServiceRest {

    @GetMapping("/")
    public RedirectView sayHello(){
        return new RedirectView("/timer");
    }
}
