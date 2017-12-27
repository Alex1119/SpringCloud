package com.example.user.service;

import com.example.eurekaserver.sevice.EurekaOrderService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-order", fallback = OrderServiceHystric.class)
public interface OrderService extends EurekaOrderService {

    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    String getOrder(@RequestParam("orderId") String orderId);

}