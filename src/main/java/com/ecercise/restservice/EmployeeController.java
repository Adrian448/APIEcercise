package com.ecercise.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecercise.entitys.Employee;

@RestController
public class EmployeeController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/employee")
	public Employee employee(@RequestParam(value = "firstName", defaultValue = "nothing here") String name) {
		//return new Employee(counter.incrementAndGet(), String.format(template, name));
	//}
}