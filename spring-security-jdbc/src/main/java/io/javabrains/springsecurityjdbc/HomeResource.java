package io.javabrains.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/user")
    public String callUser(){
        return "Hello USER";
    }

    @GetMapping("/admin")
    public String callAdmin(){
        return "Hello ADMIN";
    }
}
