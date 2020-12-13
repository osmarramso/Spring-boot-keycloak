package com.baeldung.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.baeldung.keycloak.WebController"})
public class SpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }

}
