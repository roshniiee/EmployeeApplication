package com.cg.empapp.ui;

import java.util.Scanner;

import com.cg.empapp.service.EmployeeServiceImpl;

import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;


public class Client {
	static EmployeeServiceImpl serviceobj=new EmployeeServiceImpl();
	 static Employee empobj;
	public static void main(String[] args)  {
		{
	    	int ch;
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
	System.out.println(" 1-Add Employee\n 2-Get All Employee Details \n 3-Get Employee By Id \n 4-Exit \n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			System.out.println("Enter the id \n");
			int id=sc.nextInt();
			String name;
			do {
			System.out.println("Enter the name \n");
			name=sc.next();
			
			}while(!serviceobj.isEmpNameValid(name));
			int salary;
			do{System.out.println("Enter the salary \n");
			 salary=sc.nextInt();
			}while(!serviceobj.isEmpSalValid(salary));
		
		
		
		empobj=new Employee(id,name,salary);
		serviceobj.insertEmployee(empobj);
		System.out.println("Employee Information stored successfully for "+id);	
				break;
		
             case 2:
       
            	 try {
					System.out.println(serviceobj.getAllEmployees());
				} catch (EmployeeException e) {
System.out.println(e);
				}
				break;
          case 3:
              System.out.println("Enter id ");
	int eid=sc.nextInt();
				try {
					System.out.println(serviceobj.getEmployeeById(eid));
				} catch (EmployeeException e) {
					System.out.println(e);
				}
              break;
             case 4:
				System.out.println("END");
				System.exit(0);
				break;
             default:
            	
            		System.out.println("Enter correct choice");
            			System.out.println(" 1-Add Employee\n 2-Get All Employee Details \n"
            					+ " 3-Get Employee By Id \n 4-Exit  \n");
            			System.out.print("Enter your choice : ");
            			ch = sc.nextInt();

            		
            	 
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
	}while(ch!=4);
		
		sc.close();

		//implement a menu driven program based on sample input / output shown
	}
		
		
		}
		


}
