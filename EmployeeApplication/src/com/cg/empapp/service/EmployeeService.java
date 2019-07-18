package com.cg.empapp.service;

import java.util.HashMap;

import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;

public interface EmployeeService 
{
		public void insertEmployee(Employee emp);
	public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException;
	public Employee getEmployeeById(int id)throws EmployeeException;

}
