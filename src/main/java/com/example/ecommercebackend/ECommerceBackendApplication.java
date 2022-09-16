package com.example.ecommercebackend;

import com.example.ecommercebackend.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfig.class)
public class ECommerceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceBackendApplication.class, args);
    }

}
