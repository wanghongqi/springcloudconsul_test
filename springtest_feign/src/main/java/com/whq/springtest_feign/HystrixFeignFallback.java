package com.whq.springtest_feign;

import org.springframework.stereotype.Component;

@Component
public class HystrixFeignFallback implements MyFeignClient {
    @Override
    public String home(){
        return "Hystrix home";
    }
    @Override
    public String test(String id) {
        return "Hystrix test"+id;
    }
}
