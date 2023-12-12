package net.javaguide.springbootannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class VegPizza implements Pizza{
    public String getPizza(){
        return "veg Pizza";
    }

}
