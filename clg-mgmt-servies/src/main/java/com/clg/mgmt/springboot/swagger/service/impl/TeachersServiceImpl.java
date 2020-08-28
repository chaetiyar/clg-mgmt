package com.clg.mgmt.springboot.swagger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clg.mgmt.springboot.swagger.dao.TeachersDao;
import com.clg.mgmt.springboot.swagger.model.Teachers;
import com.clg.mgmt.springboot.swagger.model.TeachaersList;
import com.clg.mgmt.springboot.swagger.service.TeachersService;

@Service
@Transactional
public class TeachersServiceImpl implements TeachersService{

	@Autowired
	TeachersDao dao;
	
	@Override
	public TeachaersList getAllTeachers() {
		return dao.getAllTeachers();
	}

	@Override
	public Teachers saveTeachers(Teachers teachers) {
		return dao.saveTeachers(teachers);
	}

}
