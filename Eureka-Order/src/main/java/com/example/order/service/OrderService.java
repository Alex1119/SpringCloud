package com.example.order.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Value("${server.port}")
    String serverPort;

    public String getOrder(String orderId){
        return String.format("GET ORDER %s @%s SUCCESS!", orderId, serverPort);
    }

}