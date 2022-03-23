package com.youn.dao;

import org.apache.ibatis.annotations.Mapper;
import com.youn.vo.Employee;
import java.util.List;

@Mapper
public interface EmployeeDao {
	
	List<Employee> employeeList();

}
