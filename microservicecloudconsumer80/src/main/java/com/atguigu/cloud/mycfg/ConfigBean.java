package com.atguigu.cloud.mycfg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate GetRestTemplate()
    {
        return  new RestTemplate();
    }
//
//    @Bean
//    public IRule myRule()
//    {
//        return new RandomRule();
//    }

}
