package com.clg.mgmt.springboot.swagger.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clg.mgmt.springboot.swagger.model.Student;
import com.clg.mgmt.springboot.swagger.model.StudentGroup;
import com.clg.mgmt.springboot.swagger.model.TeachaersList;
import com.clg.mgmt.springboot.swagger.model.Teachers;
import com.clg.mgmt.springboot.swagger.service.StudentService;
import com.clg.mgmt.springboot.swagger.service.TeachersService;

@RestController
@RequestMapping(value= "/clgGrp")
public class StudentTeachersGrpController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	TeachersService teachersService;
	
	@GetMapping(value= "/getall")
	public StudentGroup getGroupFromService() {
		StudentGroup group = new StudentGroup();
		group.setType("200");
		group.setList(studentService.getGroupFromService());
		
		return group;
	}
	
	@GetMapping(value= "/get/{id}")
	public Optional<Student> getChitGrpById(@PathVariable(name= "id") Long rollNo) {
		return studentService.getGroupByIdFromService(rollNo);
	}
	
	@PostMapping(value= "/createStudent")
	public Student createChitGrp(@RequestBody Student student) {
		return studentService.createStudentGrp(student);
	}
	
	@GetMapping(value= "/get-all-teachers")
	public TeachaersList getAllTeachersService() {
		return teachersService.getAllTeachers();
	}
	
	@PostMapping(value= "/save-teachers")
	public Teachers saveCustomer(@RequestBody Teachers teachers) {
		return teachersService.saveTeachers(teachers);
	}
}