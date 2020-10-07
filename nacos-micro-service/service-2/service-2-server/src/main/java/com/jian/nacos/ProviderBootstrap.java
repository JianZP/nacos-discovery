package com.jian.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBootstrap.class,args);
    }
}
