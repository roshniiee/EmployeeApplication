package com.cg.empapp.service;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.empapp.dao.EmployeeDaoImpl;
import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;


public class EmployeeServiceImpl implements EmployeeService
{
	 EmployeeDaoImpl daoobj=new EmployeeDaoImpl();
	    Scanner sc=new Scanner(System.in);
	@Override
	public void insertEmployee(Employee emp) {
		  
        daoobj.insertEmployee(emp);
		
		
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException {
	
		
		daoobj.getAllEmployees(); 
		HashMap<Integer, Employee> map = daoobj.getMap();
		if(map.isEmpty()) {
			throw new EmployeeException();
		}
		else {
		return map;
		}
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		
		   Employee e= daoobj.getEmployeeById(id);
		 if(id==e.getEmpId())
		 {
		return e;
		 }
		 else
			 throw new EmployeeException();
		
	}
	//Method to validate employee name
	public boolean isEmpNameValid(String name) {
		 boolean b=false;
 		
			if(name.length()>=3 && Character.isUpperCase(name.charAt(0)) )
	    
		b= true;
		    			
			return b;
	
		
	}
	 //Method to validate employee salary
	public boolean isEmpSalValid(int salary) {
		 boolean b=false;
			if(salary>0)
	     
				b=true;
			
	return b;
		
		
	}
	
	
}