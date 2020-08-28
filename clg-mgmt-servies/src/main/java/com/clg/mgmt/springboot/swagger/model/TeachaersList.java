package com.clg.mgmt.springboot.swagger.model;

import java.util.List;

public class TeachaersList {
	
	private String type;
	private List<Teachers> list;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Teachers> getList() {
		return list;
	}
	public void setList(List<Teachers> list) {
		this.list = list;
	}

}
