package com.altsystem.Teste4.controllers;

import com.altsystem.Teste4.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControler {

    private static final String template = "HELLO, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "WORD")
            String  name) {

        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }

}
