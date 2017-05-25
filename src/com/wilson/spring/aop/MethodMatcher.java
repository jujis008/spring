package com.wilson.spring.aop;

import java.lang.reflect.Method;

public interface MethodMatcher {
	boolean matches(Method method, Class<?> targetClass);
	
	boolean matches(Method method, Class<?> targetClass, Object[] args);
	
	boolean isRuntime();
	
	MethodMatcher TRUE = TrueMethodMatcher.INSTANCE;
}
