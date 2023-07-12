package com.personal.ehm.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.personal.ehm.entity.User;
import com.personal.ehm.request.UserRequest;
import com.personal.ehm.service.UserService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserHelper {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public User getEntity(UserRequest userRequest) {
		log.info("inside userRequest with request :{}",userRequest);
		User user;
		if(userRequest.getId()!=null) 
			user = userService.findById(userRequest.getId());
		else
			user = new User();
		user.setName(userRequest.getName());
		user.setEmail(userRequest.getEmail());
		user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		user.setUserName(userRequest.getUserName());
		user.setPhoneNumber(userRequest.getPhoneNumber());
		user.setUserType(userRequest.getUserType());
		return user;
	}

}
