package com.clg.mgmt.springboot.swagger.model;

import java.util.List;

public class StudentGroup {

	private String type;
	private List<Student> list;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
}
