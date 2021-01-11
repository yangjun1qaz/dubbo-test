package com.honey.consumer.controller;

import com.honey.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Date: Created in 2021/1/5 23:33
 * @Author Brayden
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerTest;


    @GetMapping("/getOrderList")
    public String getOrderList() {
        return consumerTest.getOrderList();
    }


    @GetMapping("/getUser")
    public String getUser() {
        return consumerTest.getUser();
    }
}
