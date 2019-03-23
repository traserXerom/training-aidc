package com.anabatic.training.trainings.endpoint;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.GeneralException;

public class SecurityExceptionHandler implements AuthenticationEntryPoint {

	  @Override
	    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException authException) throws IOException, ServletException {
		  throw new GeneralException(ErrorConstant.UNAUTHORIZED_ACCESS);
	    }

}
