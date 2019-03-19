package com.whq.springtest_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.*;

@SpringBootApplication
@Configuration
public class SpringtestGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestGatewayApplication.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> routeCity(HiHandler hiHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hi")
                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                        hiHandler::Hi);
    }
}

