package com.hth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hth.entity.Employee;
import com.hth.mapper.EmployeeMapper;
import com.hth.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * 员工信息(Employee)表服务实现类
 *
 * @author makejava
 * @since 2023-11-13 21:17:21
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
