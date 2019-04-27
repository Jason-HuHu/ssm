package com.ssm.boot.dao;

import com.ssm.boot.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
	public List<Employee> getAllEmps();

}
