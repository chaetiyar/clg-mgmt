package com.fin.chit.group.common.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeachersList {
	
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
