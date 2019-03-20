package com.github.sonhal.restfulwebservice.controller;


import com.github.sonhal.restfulwebservice.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {



    @GetMapping(path = "/greeting")
    public String greeting(){
        return "Hello World!";
    }

    @GetMapping(path = "/greeting-bean")
    public Greeting greetingBean(){
        return new Greeting("Hello World!");
    }
}
