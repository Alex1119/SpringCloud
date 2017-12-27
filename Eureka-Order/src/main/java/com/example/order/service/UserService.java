package com.example.order.service;

import com.example.eurekaserver.sevice.EurekaUserService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-user", fallback = UserServiceHystric.class)
public interface UserService extends EurekaUserService{

    @RequestMapping(value = "/createUser",method = RequestMethod.GET)
    String createUser(@RequestParam("userName") String userName);

}