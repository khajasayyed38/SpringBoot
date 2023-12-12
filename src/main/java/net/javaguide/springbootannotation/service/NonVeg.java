package net.javaguide.springbootannotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class NonVeg implements Pizza{

    @Override
    public String getPizza() {
        return "Non-Veg  Pizza";
    }
}
