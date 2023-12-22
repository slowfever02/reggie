package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;


/**
 * 套餐(Setmeal)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-04 17:56:52
 */
@Mapper
public interface SetmealMapper extends BaseMapper<Setmeal> {

}
