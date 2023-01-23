package com.example.springex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name(){
        return "My Name is Abdulrahman";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 29";
    }

    @GetMapping("/check/status")
    public String check(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
}
