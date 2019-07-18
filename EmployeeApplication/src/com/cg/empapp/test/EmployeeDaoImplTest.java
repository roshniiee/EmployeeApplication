package com.cg.empapp.test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

import com.cg.empapp.dao.EmployeeDaoImpl;
import com.cg.empapp.dto.Employee;



public class EmployeeDaoImplTest {
	
	@Test
	public void daoTest() {
		Employee e=new Employee(1, "Roshni",30000);
		HashMap<Integer,Employee> map=new HashMap<Integer, Employee>();
		EmployeeDaoImpl daobj=new EmployeeDaoImpl();
		map.put(1, e);
		Employee expected=map.get(1);
		Employee actual=map.get(e.getEmpId());
		 assertEquals(expected,actual);
		
		
		
		
	
		
	
		
	}
	
	
		
	}
	

	



	

