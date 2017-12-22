package com.example.eurekauser.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${server.port}")
    String serverPort;

    public String createUser(String userName) throws Exception {
        throw new Exception("OCCUR AN EXCEPTION");
//        return String.format("CREATE USER %s @%s SUCCESS!", userName, serverPort);
    }

}
