package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.entity.Employee;
import org.apache.ibatis.annotations.Mapper;


/**
 * 员工信息(Employee)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-13 21:17:19
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
