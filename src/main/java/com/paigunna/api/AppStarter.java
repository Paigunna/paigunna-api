package com.paigunna.api;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.paigunna.api")
public class AppStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args);
    }
}
