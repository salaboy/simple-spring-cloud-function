package org.spring.cloud.functions.simplefunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class SimpleFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleFunctionApplication.class, args);
    }

    @Bean
    public Function<String,String> uppercase() {
        return String::toUpperCase;
    }
}
