package com.ssm.boot.service;

import com.ssm.boot.bean.Employee;
import com.ssm.boot.dao.EmployeeMapper;
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
