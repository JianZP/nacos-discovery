package com.jian.nacos.controller;

import com.jian.nacos.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    //注入service（基于dubbo协议的）
    @org.apache.dubbo.config.annotation.Reference  //生成接口的代理对象，通过代理对象进行远程调用
    ConsumerService consumerService;
    @GetMapping("/service")
    public String service(){
        //远程调用
        String s = consumerService.service();
        return s+"| test";
    }
}
