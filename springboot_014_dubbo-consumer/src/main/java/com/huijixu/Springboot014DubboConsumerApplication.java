package com.huijixu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo   //启用服务
public class Springboot014DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot014DubboConsumerApplication.class, args);
    }

}
