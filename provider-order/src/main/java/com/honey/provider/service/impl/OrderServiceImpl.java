package com.honey.provider.service.impl;

import com.honey.dubboapi.service.OrderService;
import com.honey.dubboapi.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Date: Created in 2021/1/3 23:10
 * @Author Brayden
 * @Version 1.0
 */
@DubboService(version = "1.1.0", protocol = "dubbo")
@Component
public class OrderServiceImpl implements OrderService {

    @DubboReference(version = "1.1.0",protocol = "dubbo")
    private UserService userService;

    @Override
    public String getOrderList() {
        System.out.println("OrderServiceImpl");
        return userService.getUser();
    }
}
