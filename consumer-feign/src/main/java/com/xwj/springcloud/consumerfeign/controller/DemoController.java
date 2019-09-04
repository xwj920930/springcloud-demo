package com.xwj.springcloud.consumerfeign.controller;

import com.xwj.springcloud.consumerfeign.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/27 16:22
 * @Version 1.0
 **/
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;
    @RequestMapping("/hi")
    public String hi(@RequestParam("name")String name){
        return demoService.sayHi(name);
    }
}
