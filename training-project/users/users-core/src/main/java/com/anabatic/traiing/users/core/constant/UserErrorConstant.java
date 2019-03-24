package com.anabatic.traiing.users.core.constant;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.Error;

public class UserErrorConstant extends ErrorConstant {
	public static final Error ROLE_NOT_FOUND 			= new Error("USR-100", "Role not found.", "Role tidak ditemukan.", 400);
}
