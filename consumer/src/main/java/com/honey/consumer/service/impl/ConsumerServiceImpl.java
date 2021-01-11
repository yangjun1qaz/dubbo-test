package com.honey.consumer.service.impl;

import com.honey.consumer.service.ConsumerService;
import com.honey.dubboapi.service.OrderService;
import com.honey.dubboapi.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description：
 * @Date: Created in 2021/1/5 23:28
 * @Author Brayden
 * @Version 1.0
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private OrderService orderService;

    @DubboReference(version = "1.1.0", protocol = "dubbo")
    private UserService userService;


    @Override
    public String getOrderList() {

        return orderService.getOrderList();
    }

    @Override
    public String getUser() {
        return userService.getUser();
    }
}
