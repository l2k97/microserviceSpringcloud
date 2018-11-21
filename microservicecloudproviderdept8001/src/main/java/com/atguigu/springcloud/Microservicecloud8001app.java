package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Microservicecloud8001app {

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(Microservicecloud8001app.class,args);
    }
}
