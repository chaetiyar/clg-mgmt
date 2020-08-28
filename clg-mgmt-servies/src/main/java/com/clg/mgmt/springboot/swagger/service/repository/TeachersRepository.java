package com.clg.mgmt.springboot.swagger.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clg.mgmt.springboot.swagger.model.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Long>{

}
