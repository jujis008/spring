package com.wilson.spring.aop;

import com.wilson.spring.core.NestedRuntimeException;

@SuppressWarnings("serial")
public class AopInvocationException extends NestedRuntimeException{

	public AopInvocationException(String message) {
		super(message);
	}
	
	public AopInvocationException(String message, Throwable cause) {
		super(message, cause);
	}
}
