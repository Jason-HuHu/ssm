package com.ssm.boot.dao;

import com.huxl.ssm.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
	public List<Employee> getAllEmps();

}
