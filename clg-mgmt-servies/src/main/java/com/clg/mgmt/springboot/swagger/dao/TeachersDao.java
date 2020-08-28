package com.clg.mgmt.springboot.swagger.dao;

import com.clg.mgmt.springboot.swagger.model.Teachers;
import com.clg.mgmt.springboot.swagger.model.TeachaersList;

public interface TeachersDao {

	public TeachaersList getAllTeachers();

	public Teachers saveTeachers(Teachers teachers);
}
