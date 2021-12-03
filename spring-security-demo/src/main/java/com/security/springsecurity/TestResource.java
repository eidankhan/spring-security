package com.security.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
    
    @GetMapping("/")
    public String sayHello(){
        return ("<h1> Hello Spring Security </h1>");
    }

    @GetMapping("/user")
    public String callUser(){
        return ("<h1> Hello USER </h1>");
    }

    @GetMapping("/admin")
    public String callAdmin(){
        return ("<h1> Hello ADMIN </h1>");
    }


}
