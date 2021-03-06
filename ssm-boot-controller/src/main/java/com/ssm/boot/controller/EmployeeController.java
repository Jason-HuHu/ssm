package com.ssm.boot.controller;

import com.ssm.boot.bean.Employee;
import com.ssm.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by JasonHu on 2017/4/19.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/getAllEmps")
    public String getAllEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getAllEmps();
        map.put("emps",emps);
        return "list";
    }

}
