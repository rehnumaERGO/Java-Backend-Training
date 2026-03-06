package com.train.quickstart.service;

import org.springframework.stereotype.Service;
import com.train.quickstart.model.Message;

@Service
public class HelloService {

    public Message getMessage() {
        return new Message("Hello from Spring Boot Service!");
    }

}