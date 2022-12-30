package me.code.fulldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FullDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullDemoApplication.class, args);
    }

}
