package com.example.user.controller;

import com.example.eurekaserver.sevice.EurekaUserService;
import com.example.user.service.OrderService;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaUserServiceImpl implements EurekaUserService {

    @Autowired
    UserService mUserService;
    @Autowired
    OrderService mOrderService;

    @Override
    @RequestMapping(value="/createUser", method = RequestMethod.GET)
    public String createUser(String userName) throws Exception {
        return mUserService.createUser(userName);
    }

    @RequestMapping(value="/getOrder", method = RequestMethod.GET)
    public String getOrder(String orderId){
        return mOrderService.getOrder(orderId);
    }

}
