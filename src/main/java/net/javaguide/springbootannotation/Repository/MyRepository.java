package net.javaguide.springbootannotation.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String helloRepository(){
        return "Hello Repository";
    }
}
