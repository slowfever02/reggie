package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.Dish;
import org.apache.ibatis.annotations.Mapper;


/**
 * 菜品管理(Dish)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-04 17:55:52
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}
