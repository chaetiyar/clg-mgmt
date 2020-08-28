package com.clg.mgmt.springboot.swagger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clg.mgmt.springboot.swagger.dao.TeachersDao;
import com.clg.mgmt.springboot.swagger.model.Teachers;
import com.clg.mgmt.springboot.swagger.model.TeachaersList;
import com.clg.mgmt.springboot.swagger.service.repository.TeachersRepository;

@Repository
public class TeachersDaoImpl implements TeachersDao{

	@Autowired
	TeachersRepository repo;
	
	@Override
	public TeachaersList getAllTeachers() {
		TeachaersList list = new TeachaersList();
		list.setType("200");
		List<Teachers> customer = repo.findAll();
		list.setList(customer);
		return list;
	}

	@Override
	public Teachers saveTeachers(Teachers teachers) {
		return repo.save(teachers);
	}

}
