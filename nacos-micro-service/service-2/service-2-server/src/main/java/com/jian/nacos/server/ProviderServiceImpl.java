package com.jian.nacos.server;

import com.jian.nacos.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String service() {
        return "provider invoke";
    }
}
