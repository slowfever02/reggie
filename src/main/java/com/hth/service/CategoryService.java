package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.entity.Category;


/**
 * 菜品及套餐分类(Category)表服务接口
 *
 * @author makejava
 * @since 2023-11-20 23:00:59
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);

}
