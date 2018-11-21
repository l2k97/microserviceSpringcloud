package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka_app_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_app_7001.class, args);
    }
}
