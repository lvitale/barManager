package com.bar.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bar.entity.User;
import com.bar.model.CustomerModel;
import com.bar.model.UserModel;
import com.bar.repository.UserRepository;

@Component
@Scope("singleton")
public class UserManager {
	
	@Autowired
	private UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserManager() {
		
	}
	
	
	
	public List<UserModel> findCustomer(){
		Iterable<User> list = userRepository.findAll();
		List<UserModel> customList = new ArrayList();
		list.forEach(z-> customList.add(new CustomerModel(z)) );
		return customList;
	}
	
	private void trackingUser(List<?> list) {
		list.forEach(z-> System.out.println(z));
		
	}
}
