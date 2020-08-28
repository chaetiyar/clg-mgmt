package com.clg.mgmt.group.servies;

import java.util.List;
import java.util.Optional;

import com.clg.mgmt.group.common.dao.Student;
import com.clg.mgmt.group.common.dao.Teachers;


public interface StudentServies {
	
	public Student createStudent(Student students);

	public List<Student> getStudentGroupFromService();
	
	public Optional<Student> getGroupByIdFromService(int groupId);


	public List<Teachers> getAllTeachersService();
	
	public Teachers saveTeachersService(Teachers teachers);
	
	

}
