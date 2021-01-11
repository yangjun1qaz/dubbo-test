package com.honey.dubboapi.service;

/**
 * @Description：
 * @Date: Created in 2021/1/3 23:09
 * @Author Brayden
 * @Version 1.0
 */
public interface OrderService {

    /**
     * 获取订单详情
     *
     * @return
     */
    public String getOrderList();

    /**
     * 查询商品详情
     *
     * @return
     */
    public String getOrderDetails();
}
