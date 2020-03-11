package com.bar.model;

import com.bar.entity.User;

public class CustomerModel extends UserModel{

	private String type;

	public CustomerModel() {}
	
	public CustomerModel(User user) {
		setPerson(user.getName());
		setMail(user.getEmail());   
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
