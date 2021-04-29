package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest{
    @RequestMapping("/")
    public String rest(){
        return "It works";
    }
}
