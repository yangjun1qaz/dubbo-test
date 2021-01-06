package com.honey.consumer.service.impl;

import com.honey.consumer.service.ConsumerService;
import com.honey.dubboapi.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Date: Created in 2021/1/5 23:28
 * @Author Brayden
 * @Version 1.0
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference(version = "1.1.0",protocol = "dubbo")
    private OrderService orderService;


    @Override
    public String test() {
        return orderService.getOrderList();
    }
}
