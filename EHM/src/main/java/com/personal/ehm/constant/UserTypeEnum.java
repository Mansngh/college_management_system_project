package com.personal.ehm.constant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum UserTypeEnum {

	MASTER_ADMIN("Master Admin"), ADMIN("Admin"), MASTER_ORGANIZATION("Master Organization"),
	ORGANIZATION("Organization"), USER("User");

	String displayName;
}
