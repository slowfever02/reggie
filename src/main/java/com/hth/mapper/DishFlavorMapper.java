package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;


/**
 * 菜品口味关系表(DishFlavor)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-07 10:42:58
 */
@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

}
