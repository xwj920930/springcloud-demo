package com.xwj.springcloud.consumerribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/27 11:09
 * @Version 1.0
 **/
@Service
public class DemoService {
    @Autowired
    RestTemplate restTemplate;
    public String demoService(String name){
        return restTemplate.getForObject("http://producer/hi?name="+name,String.class);
    }
}
