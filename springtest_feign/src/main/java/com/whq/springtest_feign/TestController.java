package com.whq.springtest_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    MyFeignClient myFeignClient;
    @RequestMapping("/home")
    public String home(){
        return myFeignClient.home();
    }
    @RequestMapping("/test")
    public String test(String id){
        return myFeignClient.test(id);
    }
}
