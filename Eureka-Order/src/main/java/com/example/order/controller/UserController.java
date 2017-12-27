package com.example.order.controller;

import com.example.order.service.OrderService;
import com.example.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService mUserService;

    @Autowired
    OrderService mOrderService;

    @RequestMapping(value = "/createUser",method = RequestMethod.GET)
    public String createUser(@RequestParam("userName") String userName){
        return mUserService.createUser(userName);
    }

    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    public String getOrder(@RequestParam("orderId") String orderId){
        return mOrderService.getOrder(orderId);
    }

}
