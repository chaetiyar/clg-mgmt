package com.clg.mgmt.springboot.swagger.service;

import com.clg.mgmt.springboot.swagger.model.Teachers;
import com.clg.mgmt.springboot.swagger.model.TeachaersList;

public interface TeachersService {

	public TeachaersList getAllTeachers();

	public Teachers saveTeachers(Teachers teachers);
}
