package com.personal.ehm.entity;

import com.personal.ehm.constant.RoleTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role extends  BaseEntity {
	
	@Column(name="name")
	String name;
	
	@Enumerated
	@Column(name="role_type")
	RoleTypeEnum roleTypeEnum;
}
