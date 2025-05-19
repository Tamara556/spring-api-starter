package com.codewithmosh.store.endpoint;

import com.codewithmosh.store.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageEndpoint {
    @RequestMapping("/hello")
    public Message sayHello(){
        return new Message( "Hello World");
    }
}
