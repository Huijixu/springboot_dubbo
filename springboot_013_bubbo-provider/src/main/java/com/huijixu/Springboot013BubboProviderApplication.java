package com.huijixu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo   // 启动dubbo服务
public class Springboot013BubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot013BubboProviderApplication.class, args);
    }

}
