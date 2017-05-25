package com.wilson.spring.aop;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;

public interface AfterReturningAdvice extends Advice {
	void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable;
}
