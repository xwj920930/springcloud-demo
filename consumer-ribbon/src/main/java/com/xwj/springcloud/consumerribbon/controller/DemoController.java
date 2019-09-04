package com.xwj.springcloud.consumerribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xwj.springcloud.consumerribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/27 11:08
 * @Version 1.0
 **/
@RestController
@DefaultProperties(defaultFallback = "defaultError")
public class DemoController {
    @Autowired
    DemoService demoService;
    @RequestMapping("/hi")
//    单独设置降级时间，注意服务降级和熔断区别，降级是超过多久返回错误，熔断是
//    连续超时10次以后断开，直接返回错误，5秒后记录成功百分比一次断定是否结束熔断
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//    })
//    单独设置方法的降级返回
//    @HystrixCommand(fallbackMethod = "hiError")
//    熔断修改默认设置
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
//    })
    @HystrixCommand
    public String hi(@RequestParam String name){
        return demoService.demoService(name);
    }
//    public String hiError(String name){
//        return "服务器超时";
//    }
    public String defaultError(){
        return "服务器超时";
    }
}
