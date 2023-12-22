package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.dto.DishDto;
import com.hth.entity.Dish;
import com.hth.entity.DishFlavor;


/**
 * 菜品管理(Dish)表服务接口
 *
 * @author makejava
 * @since 2023-12-04 17:55:52
 */
public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表，dish.dishFlavor
    void dishWithFlavor(DishDto dishDto);
    //根据id查询菜品信息和口味信息
    DishDto getByIdWithFlavor(Long id);
    //修改菜品信息和口味信息
    void updateWithFlavor(DishDto dishDto);
}
