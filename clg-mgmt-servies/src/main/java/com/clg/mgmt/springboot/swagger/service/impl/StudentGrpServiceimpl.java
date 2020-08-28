package com.clg.mgmt.springboot.swagger.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clg.mgmt.springboot.swagger.dao.StudentGrpDao;
import com.clg.mgmt.springboot.swagger.model.Student;
import com.clg.mgmt.springboot.swagger.service.StudentService;

@Service
@Transactional
public class StudentGrpServiceimpl implements StudentService {
	
	@Autowired
	StudentGrpDao dao;

	@Override
	public List<Student> getGroupFromService() {
		return dao.getGroupFromService();
	}

	@Override
	public Optional<Student> getGroupByIdFromService(Long groupId) {
		return dao.getGroupByIdFromService(groupId);
	}

	@Override
	public Student createStudentGrp(Student student) {
		return dao.createStudentGrp(student);
	}	
}