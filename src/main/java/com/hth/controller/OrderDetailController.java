package com.hth.controller;

import com.hth.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单明细表(OrderDetail)表控制层
 *
 * @author makejava
 * @since 2023-12-12 10:46:12
 */
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController  {
    /**
     * 服务对象
     */
    @Autowired
    private OrderDetailService orderDetailService;


}

