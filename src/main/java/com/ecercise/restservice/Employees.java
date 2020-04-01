package com.ecercise.restservice;
import com.ecercise.entitys.Employee;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class Employees {
	
	List<Employee> employees ;
	public List<Employee> getEmployeeList() {
        if(employees == null) {
            employees = new ArrayList<>();
        }
        return employees;
    }
	
	 public void setEmployees(List<Employee> employees) {
	        this.employees = employees;
	    }
	

}
