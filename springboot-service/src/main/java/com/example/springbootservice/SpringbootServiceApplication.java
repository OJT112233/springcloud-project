package com.example.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@RefreshScope   //开启配置更新功能
@SpringBootApplication
public class SpringbootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceApplication.class, args);
    }

}
