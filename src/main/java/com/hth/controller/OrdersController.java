package com.hth.controller;

import com.hth.common.R;
import com.hth.entity.Orders;
import com.hth.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 订单表(Orders)表控制层
 *
 * @author makejava
 * @since 2023-12-12 10:46:01
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrdersController {
    /**
     * 服务对象
     */
    @Autowired
    private OrdersService ordersService;

    /**
     * 下单
     * @param orders
     * @return
     */
    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        log.info("下单数据:{}",orders);
        ordersService.submit(orders);
        return R.success("下单成功");
    }

}

