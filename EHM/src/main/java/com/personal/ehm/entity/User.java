package com.personal.ehm.entity;

import java.util.List;

import com.personal.ehm.constant.UserTypeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

	@Column(name = "name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="phone_number")
	String phoneNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name="user_type" ,nullable = false)
	UserTypeEnum userType;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
	List<UserRole> userRole;
	
	
}
