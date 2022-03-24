package com.youn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.youn.dao.EmployeeDao;
import com.youn.vo.Employee;

@RestController

public class EmployeeController {
	
	@Autowired
	EmployeeDao empDao;
	
	/*
	@RequestMapping(value = "/home")
	public String home() {
		return "index.html";
	}*/
	
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public List<Employee> list() {
		return empDao.employeeList();
	}

}
