package com.example.eurekaorder.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystric implements UserService {

    @Value("${server.port}")
    String serverPort;

    @Override
    public String createUser(String userName) {
        return String.format("SERVICE IS NOT AVALIABLE @%s", serverPort) ;
    }
}
