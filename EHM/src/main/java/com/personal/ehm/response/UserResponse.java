package com.personal.ehm.response;

import com.personal.ehm.constant.UserTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

	Long id;
	
	String name;
	
	String email;
	
	String userName;
	
	String password;
	
	String phoneNumber;
	
	UserTypeEnum userType;
	
}
