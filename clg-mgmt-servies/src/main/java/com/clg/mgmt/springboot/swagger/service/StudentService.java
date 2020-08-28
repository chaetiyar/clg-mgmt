package com.clg.mgmt.springboot.swagger.service;

import java.util.List;
import java.util.Optional;

import com.clg.mgmt.springboot.swagger.model.Student;

public interface StudentService {

	public List<Student> getGroupFromService();
	
	public Optional<Student> getGroupByIdFromService(Long groupId);

	public Student createStudentGrp(Student chit);
	
	

}