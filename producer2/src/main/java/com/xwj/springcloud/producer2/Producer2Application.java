package com.xwj.springcloud.producer2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Producer2Application {

	public static void main(String[] args) {
		SpringApplication.run(Producer2Application.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name")String name){
//		模拟服务降级
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		}
		return "hi "+name+",i am from port:"+port;
	}

}
