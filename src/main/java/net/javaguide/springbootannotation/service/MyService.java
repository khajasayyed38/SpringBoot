package net.javaguide.springbootannotation.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String helloService(){
        return "Hello Service";
    }
}
