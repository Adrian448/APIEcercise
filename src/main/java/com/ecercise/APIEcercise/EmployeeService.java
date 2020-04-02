package com.ecercise.APIEcercise;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.ecercise.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ecercise.entitys.Employee;
import com.ecercise.restservice.Employees;
@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public List getAllEmployees() {
		List employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	
	public Employee getEmployee(String id) {
		return (Employee) employeeRepository.findById(id).orElseGet(Employee::new);
	}
	public void addEmployee (Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
	
	}
