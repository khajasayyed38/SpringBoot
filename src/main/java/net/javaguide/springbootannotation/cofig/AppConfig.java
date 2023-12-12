package net.javaguide.springbootannotation.cofig;

import net.javaguide.springbootannotation.controller.PizzaController;
import net.javaguide.springbootannotation.service.NonVeg;
import net.javaguide.springbootannotation.service.Pizza;
import net.javaguide.springbootannotation.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVeg();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }


}
