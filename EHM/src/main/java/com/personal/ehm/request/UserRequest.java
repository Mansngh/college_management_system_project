package com.personal.ehm.request;

import com.personal.ehm.constant.UserTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

	Long id;
	
	String name;
	
	String email;
	
	String userName;
	
	String password;
	
	String phoneNumber;
	
	UserTypeEnum userType;
}
