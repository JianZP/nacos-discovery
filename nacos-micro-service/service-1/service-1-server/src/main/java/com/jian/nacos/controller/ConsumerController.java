package com.jian.nacos.controller;

import com.jian.nacos.api.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    @GetMapping("/service")
    public String service(){
        String s = providerService.service();
        return "testttt | "+s;
    }
}
