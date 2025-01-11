package com.example.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }
    
    @GetMapping("/private")
    public String pivatePage() {
        return "private/index.html";
    }
    
    @GetMapping("/public")
    public String publicPage() {
        return "public/index.html";
    }
    
}
