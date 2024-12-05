package com.example.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")

    public String helloWorld() {
        return "Hello World! This is my first API REST" ;
    }


}
