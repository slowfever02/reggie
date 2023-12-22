package com.hth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息(User)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-10 20:37:24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
