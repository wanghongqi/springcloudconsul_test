package com.whq.springtest_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "springtest-service",fallback = HystrixFeignFallback.class)
public interface MyFeignClient {
    //这里是使用feign请求的地址
    @RequestMapping("/home")
    String home();
    @RequestMapping("/test")
    String test(@RequestParam(value = "id")String id);
}
