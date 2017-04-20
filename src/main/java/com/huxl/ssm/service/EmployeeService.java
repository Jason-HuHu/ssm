package com.huxl.ssm.service;

import com.huxl.ssm.bean.Employee;
import com.huxl.ssm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JasonHu on 2017/4/19.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmps(){
        return employeeMapper.getAllEmps();
    }
}
