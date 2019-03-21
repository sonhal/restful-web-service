package com.github.sonhal.restfulwebservice.controller;


import com.github.sonhal.restfulwebservice.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    private final MessageSource messageSource;

    @Autowired
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/greeting")
    public String greeting(){
        return "Hello World!";
    }

    @GetMapping(path = "/greeting-bean/{name}")
    public Greeting greetingBean(@PathVariable String name){
        return new Greeting(String.format("Hello World, %s", name));
    }

    @GetMapping(path = "/greeting-internationalized")
    public String greetingInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null, locale);
    }

}
