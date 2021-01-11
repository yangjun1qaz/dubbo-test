package com.honey.provider.service.impl;

import com.honey.dubboapi.service.OrderService;
import com.honey.dubboapi.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Date: Created in 2021/1/3 23:10
 * @Author Brayden
 * @Version 1.0
 */

@Service
public class OrderServiceImpl implements OrderService {

    @DubboReference(version = "1.1.0", protocol = "dubbo")
    private UserService userService;

    @Override
    public String getOrderList() {
        return userService.getUser()+"的订单列表";
    }

    @Override
    public String getOrderDetails() {
        return "我是商品详情";
    }


}
