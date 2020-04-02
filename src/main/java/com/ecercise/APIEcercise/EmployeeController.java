package com.ecercise.APIEcercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecercise.entitys.Employee;

@RestController
@RequestMapping(path = "/Employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/employees")
	public List getAllEmployees() {
		return employeeService.getAllEmployees();

	}
	
	 @GetMapping("/employees/{id}")
	    public Employee getEmployee(@PathVariable String employeeId){
	        return employeeService.getEmployee(employeeId);
	    }


	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

}
