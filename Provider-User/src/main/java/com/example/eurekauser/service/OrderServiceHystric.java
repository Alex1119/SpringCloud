package com.example.eurekauser.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceHystric implements OrderService {

    @Value("${server.port}")
    String serverPort;

    @Override
    public String getOrder(String userName) {
        return String.format("SERVICE IS NOT AVALIABLE @%s", serverPort) ;
    }

}
