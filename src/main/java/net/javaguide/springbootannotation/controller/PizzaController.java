package net.javaguide.springbootannotation.controller;

import net.javaguide.springbootannotation.service.Pizza;
import net.javaguide.springbootannotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {
   //This is based on field injection
//   @Autowired
//   @Qualifier("vegPizza")
//    private Pizza pizza;
//   @Autowired
//
   private Pizza pizza;


//THis is for Constructor injection
//    @Autowired
    public PizzaController(Pizza pizza){
        this.pizza=pizza;
    }

    //THis is based on Setter Injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza=vegPizza;
//    }

    public String Pizza(){

        return pizza.getPizza();
    }
    public void init(){
        System.out.println("initialization Logic");
    }
    public void destroy(){
        System.out.println("Destruction Logic");
    }
}
