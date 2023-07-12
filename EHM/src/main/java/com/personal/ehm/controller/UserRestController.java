package com.personal.ehm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.ehm.entity.User;
import com.personal.ehm.helper.UserHelper;
import com.personal.ehm.repository.UserRepository;
import com.personal.ehm.request.UserRequest;
import com.personal.ehm.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/rest/user")
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserHelper userHelper;
	
	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody UserRequest userRequest){
		try {
			User user = userHelper.getEntity(userRequest);
			userService.save(user);
			return new ResponseEntity<Object>(user.getId(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	

}
