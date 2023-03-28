package com.example.Deploy1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/name")
    public String devName(){
        return "Giuseppe Albanese";
    }


}