package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDataController {

	@Autowired
	StudentDataService studentDataService;
	
	@PostMapping("/studentdata/")
	public StudentData post(@RequestBody StudentData studentData) {	
		return studentDataService.create(studentData);
	}
	
	@GetMapping("/studentdata/{id}")
	public StudentData post(@PathVariable String id) {	
		Integer idInt = Integer.parseInt(id);
		return studentDataService.get(idInt);
	}
}
