package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.entity.Orders;


/**
 * 订单表(Orders)表服务接口
 *
 * @author makejava
 * @since 2023-12-12 10:46:01
 */
public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    void submit(Orders orders);
}
