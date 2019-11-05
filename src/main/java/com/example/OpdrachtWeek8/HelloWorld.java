package com.example.OpdrachtWeek8;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class HelloWorld {

    @GetMapping(value = "/hello", produces="application/json")
    @ResponseBody
    public String Greet(){
        String greeting = "Hello, world!";

        return greeting;
    }
}
