package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    @Autowired
    Greeting greeting;

    AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting GetGreeting(@RequestParam(value = "name")String name) {
        greeting.setId(counter.incrementAndGet());
        greeting.setContent("Hi Welcome from " + name);
        return greeting;
    }
}
