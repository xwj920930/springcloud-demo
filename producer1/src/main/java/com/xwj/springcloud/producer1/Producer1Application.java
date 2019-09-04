package com.xwj.springcloud.producer1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Producer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Producer1Application.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name")String name){
		return "hi "+name+",i am from port:"+port;
	}

}
