package com.example.eurekaorder.service;

import com.example.eurekaserver.sevice.EurekaUserService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider-user")
public interface UserService extends EurekaUserService{

    @RequestMapping(value = "/createUser",method = RequestMethod.GET)
    String createUser(@RequestParam("userName") String userName);

}
