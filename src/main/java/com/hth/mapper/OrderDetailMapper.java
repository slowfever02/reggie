package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;


/**
 * 订单明细表(OrderDetail)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-12 10:46:12
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}
