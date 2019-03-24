package com.anabatic.traiing.users.core.exception;

import java.util.List;

import com.anabatic.generic.core.exception.Error;
import com.anabatic.generic.core.exception.GeneralException;

public class UserException extends GeneralException{
	private static final long serialVersionUID = 1L;

	public UserException() {
		super();
	}

	public UserException(Error exceptionKey) {
		super(exceptionKey);
	}

	public UserException(List<Error> errors, int httpStatus) {
		super(errors, httpStatus);
	}

	public UserException(String message, Throwable t) {
		super(message, t);
	}
}
