package com.whq.springtest_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
@RestController
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


    @RequestMapping(value = "/fallbackcontroller")
    public Map<String, String> fallBackController() {
        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "service not available");
        return res;
    }
}

