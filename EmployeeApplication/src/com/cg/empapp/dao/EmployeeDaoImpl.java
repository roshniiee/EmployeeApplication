package com.cg.empapp.dao;

import java.util.HashMap;

import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;

/**
 * class to perform business logic
 */
public class EmployeeDaoImpl implements EmployeeDao{
	
	/**
    * map to hold the data
    */
	private static HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
	
    
    
    /**
    * getter for map
    */   
    public static void setMap(HashMap<Integer,Employee> map)
    {
		EmployeeDaoImpl.map=map;
    }  
    
    /**
     * Setter for the map
     */

    public static HashMap<Integer,Employee> getMap()
    {
		return map;
    }

	@Override
	public void insertEmployee(Employee emp) {
		 map.put(emp.getEmpId(),emp);
		
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException {
		if(map.isEmpty()) {
    		throw new EmployeeException("No employee found");
    		
    	}
    	else {
    	
    		getMap();
    		return map;
    	}
	
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		
		Employee e=map.get(id);
		if(map.containsKey(id))
		{
	    return e;
		}
		else
		{
			throw new EmployeeException("There is no Employee with this ID");
		}
		
	}  

   

}