package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.Category;
import org.apache.ibatis.annotations.Mapper;


/**
 * 菜品及套餐分类(Category)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-20 22:57:50
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
