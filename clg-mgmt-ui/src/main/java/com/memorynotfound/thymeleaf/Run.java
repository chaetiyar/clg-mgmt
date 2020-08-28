package com.memorynotfound.thymeleaf;

import java.util.List; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fin.chit.group.common.dao.Student;
import com.fin.chit.group.common.dao.Teachers;
import com.fin.chit.group.servies.StudentServies;

@Controller
@SpringBootApplication
public class Run {

	private static final Logger log = LoggerFactory.getLogger(Run.class);
	
	@Autowired
	StudentServies service;
	
    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }
    
    @RequestMapping("/createStudent")
    public String createStudent(Model model) {
    	Student student = new Student();
    	model.addAttribute("student", student);
    	return "form-validation";
    }
    
    @PostMapping("/saveStudent")
    public String saveStudentGroup(@ModelAttribute("student") Student student) {
    	service.createStudent(student);
    	return "redirect:/group-list";
    }
    
    @RequestMapping("/student-list")
    public String fetchAllStudent(Model model) throws Exception {
    	List<Student> studentList = service.getStudentGroupFromService();
    	log.info("Is student Group List Success : "+ studentList);
   		model.addAttribute("student GroupList", studentList);
    	return "data-table";
    }

    @RequestMapping("/createTeacher")
    public String createTeachers(Model model) {
    	Teachers teacher = new Teachers();
    	model.addAttribute("teacher", teacher);
    	return "teacher-validation";
    }
    
    @PostMapping("/saveCustomer")
    public String saveTeachers(@ModelAttribute("teacher") Teachers teacher) {
    	service.saveTeachersService(teacher);
    	return "redirect:/teachers-list";
    }
	
    @RequestMapping("/teachers-list")
    public String fetchAllTeachaers(Model model) throws Exception {
    	List<Teachers> teachersList = service.getAllTeachersService();
    	log.info("Is teachersList List Success : "+ teachersList);
   		model.addAttribute("teachersList", teachersList);
    	return "cust-table";
    }
    
   
    
    public static void main(String... args) throws Exception {
        SpringApplication.run(Run.class, args);
    }

}
