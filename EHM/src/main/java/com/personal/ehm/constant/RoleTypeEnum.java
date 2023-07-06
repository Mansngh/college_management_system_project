package com.personal.ehm.constant;

import lombok.Getter;

public enum RoleTypeEnum {

	MASTER_ADMIN("Master Admin", "A"), ADMIN("Admin", "A"), MASTER_VENDOR("Master Vendor", "V"), VENDOR("Vendor", "V");

	@Getter
	private String displayName;

	@Getter
	private String typeCode;

	private RoleTypeEnum(String displayName, String typeCode) {
		this.displayName = displayName;
		this.typeCode = typeCode;
	}
}
