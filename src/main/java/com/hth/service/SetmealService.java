package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.dto.SetmealDto;
import com.hth.entity.Setmeal;

import java.util.List;


/**
 * 套餐(Setmeal)表服务接口
 *
 * @author makejava
 * @since 2023-12-04 17:56:52
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

}
