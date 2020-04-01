package com.ecercise.APIEcercise;

import java.sql.Date;

import org.springframework.stereotype.Repository;

import com.ecercise.entitys.Employee;
import com.ecercise.restservice.Employees;
@Repository
public class EmployeeService {
	
	private static Employees employeeList = new Employees();
	 public Employees getAllEmployees() {
		 return employeeList;
	 }
	 
	 static
	    {
	        employeeList.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", new Date((long) 03.01), "howtodoinjava@gmail.com", "j j", "njnk", "jj", "jjn", "jnn", "jnj"));
	    }
	 public void addEmployee(Employee employee) {
	        employeeList.getEmployeeList().add(employee);
	    }
}
