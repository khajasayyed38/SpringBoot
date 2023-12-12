package net.javaguide.springbootannotation.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertiesSourceDemo {

    @Autowired
    private Environment environment;

//    @Value("${mail.email}")
    private String email;

//    @Value("${mail.username}")
    private String userName;

//    @Value("${mail.password}")
    private String password;

//    @Value("${message.host}")
    private String host;

//    @Value("${message.username}")
    private String username;

//    @Value("${message.password}")
    private String passWord;

    public String getEmail() {
        return environment.getProperty("mail.email");
    }

    public String getUserName() {
        return environment.getProperty("mail.username");
    }

    public String getPassword() {
        return environment.getProperty("mail.password");
    }

    public String getHost() {
        return environment.getProperty("message.host");
    }

    public String getUsername() {
        return environment.getProperty("message.username");
    }

    public String getPassWord() {
        return environment.getProperty("message.password");
    }
}
