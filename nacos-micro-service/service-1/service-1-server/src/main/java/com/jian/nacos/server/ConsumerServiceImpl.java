package com.jian.nacos.server;

import com.jian.nacos.api.ConsumerService;
import com.jian.nacos.api.ProviderService;

@org.apache.dubbo.config.annotation.Service   //标记此类的方法暴露为dubbo协议接口
public class ConsumerServiceImpl implements ConsumerService {
    //dubbo服务接口具体的实现内容
    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;
    @Override
    public String service() {
        String service = providerService.service();
        return "test | "+service;
    }
}
