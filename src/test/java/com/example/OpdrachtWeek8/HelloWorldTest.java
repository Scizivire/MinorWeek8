package com.example.OpdrachtWeek8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldTest {
    @Autowired
    HelloWorld helloWorld;

    @Test
    public void testHelloWorld(){
        String message = helloWorld.Greet();
        Assert.assertEquals("Hello, world!", message);
    }
}
