package com.clg.mgmt.group.servies.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.clg.mgmt.group.common.dao.Student;
import com.clg.mgmt.group.common.dao.StudentList;
import com.clg.mgmt.group.common.dao.Teachers;
import com.clg.mgmt.group.common.dao.TeachersList;
import com.clg.mgmt.group.servies.StudentServies;

@Service
public class StudentServiceImpl implements StudentServies{
	
	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;

	@Value("${clg-rest.url}")
	private String restUrl;
	
	@Override
	public Student createStudent(Student student) {
		Student result = restTemplate.postForObject(restUrl+"createStudent", student, Student.class);
    	return result;
	}


	@Override
	public List<Student> getStudentGroupFromService() {
		StudentList result = restTemplate.getForObject(restUrl+"getall", StudentList.class);
    	log.info("Is Group List Success : "+ result.getType());
    		return result.getList();
    }

	@Override
	public Optional<Student> getGroupByIdFromService(int groupId) {
		return null;
	}

	
	@Override
	public List<Teachers> getAllTeachersService() {
		TeachersList list = restTemplate.getForObject(restUrl+"get-all-cust", TeachersList.class);
		return list.getList();
	}

	@Override
	public Teachers saveTeachersService(Teachers teachers) {
		Teachers saveteachers =   restTemplate.postForObject(restUrl+"save-cust", teachers, Teachers.class);
		return saveteachers;
	}

	

}
