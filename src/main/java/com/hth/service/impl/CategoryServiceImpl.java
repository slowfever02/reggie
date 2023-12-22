package com.hth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hth.common.CustomException;
import com.hth.common.R;
import com.hth.entity.Category;
import com.hth.entity.Dish;
import com.hth.entity.Setmeal;
import com.hth.mapper.CategoryMapper;
import com.hth.service.CategoryService;
import com.hth.service.DishService;
import com.hth.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 菜品及套餐分类(Category)表服务实现类
 *
 * @author makejava
 * @since 2023-11-20 23:01:00
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除菜品分类
     * @param id
     */
    @Override
    public void remove(Long id) {
        //添加查询条件，根据分类id进行查询
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Dish::getCategoryId,id);
        long count1 = dishService.count(queryWrapper);
        //查询分类是否关联了菜品
        if(count1>0){
            throw new CustomException("关联了菜品，无法删除！");
        }
        //查询分类是否关联了套餐
        //添加查询条件，根据分类id进行查询
        LambdaQueryWrapper<Setmeal> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.eq(Setmeal::getCategoryId,id);
        long count2 = setmealService.count(queryWrapper2);
        //查询分类是否关联了套餐
        if(count2>0){
            throw new CustomException("关联了套餐，无法删除！");
        }
        //正常删除
        super.removeById(id);
    }
}
