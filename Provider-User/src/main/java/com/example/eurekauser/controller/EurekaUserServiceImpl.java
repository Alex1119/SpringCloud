package com.example.eurekauser.controller;

import com.example.eurekaserver.sevice.EurekaUserService;
import com.example.eurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaUserServiceImpl implements EurekaUserService {

    @Autowired
    UserService mUserService;

    @Override
    @RequestMapping(value="/createUser", method = RequestMethod.GET)
    public String createUser(String userName) {
        return mUserService.createUser(userName);
    }
}
