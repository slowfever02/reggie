package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;


/**
 * 购物车(ShoppingCart)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-11 21:58:57
 */
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

}
