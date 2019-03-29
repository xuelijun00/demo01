package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomeControllor {


    @GetMapping("/test")
    public  String say(){
        return "Hello spring boot";
    }


}
