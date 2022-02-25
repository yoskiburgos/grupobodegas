package com.gloria.gloriabnsservenrolartelefono;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("clienteRest")
    public RestTemplate resitrar(){
        return new RestTemplate();
    }
}
