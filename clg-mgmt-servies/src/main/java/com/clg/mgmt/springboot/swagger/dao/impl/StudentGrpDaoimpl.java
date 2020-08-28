package com.clg.mgmt.springboot.swagger.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clg.mgmt.springboot.swagger.dao.StudentGrpDao;
import com.clg.mgmt.springboot.swagger.model.Student;
import com.clg.mgmt.springboot.swagger.service.repository.StudentGroupRepository;

@Repository
public class StudentGrpDaoimpl implements StudentGrpDao {
	
	
	@Autowired
	StudentGroupRepository repo;

	@Override
	public List<Student> getGroupFromService() {
		List<Student> list = repo.findAll();
		return list;
	}
	
	@Override
	public Optional<Student> getGroupByIdFromService(Long groupId) {
		return repo.findById(groupId);
	}
	
	@Override
	public Student createStudentGrp(Student student) {
		return repo.save(student);
	}
	

}