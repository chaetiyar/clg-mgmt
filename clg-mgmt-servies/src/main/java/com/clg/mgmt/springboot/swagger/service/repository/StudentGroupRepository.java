package com.clg.mgmt.springboot.swagger.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clg.mgmt.springboot.swagger.model.Student;

public interface StudentGroupRepository extends JpaRepository<Student, Long>{

}
