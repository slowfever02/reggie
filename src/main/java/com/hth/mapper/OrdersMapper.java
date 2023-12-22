package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.Orders;
import org.apache.ibatis.annotations.Mapper;


/**
 * 订单表(Orders)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-12 10:46:01
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}
