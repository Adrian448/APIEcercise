package com.ecercise.APIEcercise;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ecercise.entitys.Employee;
import com.ecercise.restservice.Employees;

@RestController
@RequestMapping(path = "/Employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/", produces = "application/json")
	public Employees getEmployees() {
		return employeeService.getAllEmployees();

	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Integer id = employeeService.getAllEmployees().getEmployeeList().size() + 1;
		employee.setId(id);

		employeeService.addEmployee(employee);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

}
