package com.whq.springtest_server;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "test-config")
@Configuration
@Data
public class TestConfig {
    private String testValue;
}
