package com.xwj.springcloud.consumerfeign.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/30 21:13
 * @Version 1.0
 **/
@Component
public class DemoServiceFallback implements DemoService {
    @Override
    public String sayHi(String name) {
        return "响应超时";
    }
}
