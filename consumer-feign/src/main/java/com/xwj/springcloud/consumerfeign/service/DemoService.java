package com.xwj.springcloud.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/27 16:17
 * @Version 1.0
 **/
@FeignClient(value = "producer",fallback = DemoServiceFallback.class)
public interface DemoService {
//    @GetMapping(value = "/hi")
    @RequestMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
