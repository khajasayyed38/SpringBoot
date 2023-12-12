package net.javaguide.springbootannotation.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public  EagerLoader(){
        System.out.println("eagerLoader"); ;
    }
}
