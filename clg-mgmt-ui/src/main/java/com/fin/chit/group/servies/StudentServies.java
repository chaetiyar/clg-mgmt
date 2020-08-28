package com.fin.chit.group.servies;

import java.util.List;
import java.util.Optional;

import com.fin.chit.group.common.dao.Student;
import com.fin.chit.group.common.dao.Teachers;


public interface StudentServies {
	
	public Student createStudent(Student students);

	public List<Student> getStudentGroupFromService();
	
	public Optional<Student> getGroupByIdFromService(int groupId);


	public List<Teachers> getAllTeachersService();
	
	public Teachers saveTeachersService(Teachers teachers);
	
	

}
