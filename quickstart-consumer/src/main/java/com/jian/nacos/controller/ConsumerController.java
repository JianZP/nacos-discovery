package com.jian.nacos.controller;

import com.jian.nacos.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    //动态代理对象，内部远程调用服务的生产者
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        //发起远程调用
        String service = providerClient.service();
        return service;
    }
}
