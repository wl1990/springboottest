package com.test.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.NebulaException;
import com.test.myenum.ErrorCode;
import com.test.resp.CommResponse;



@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(NebulaException.class)
	@ResponseBody
	public CommResponse exceptionHandler(NebulaException e, HttpServletResponse response) {
		return new CommResponse(e.getErrCode(), e.getMessage());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public CommResponse validationExceptionHandler(MethodArgumentNotValidException e, HttpServletResponse response) {
		NebulaException nebulaException = new NebulaException.Builder().build(ErrorCode.VALIDATION_FAILED, e.getBindingResult());
		return exceptionHandler(nebulaException, response);
	}
}
