package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;


/**
 * 地址管理(AddressBook)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-11 19:37:48
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
