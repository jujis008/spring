package com.wilson.spring.aop;

public interface ClassFilter {
	boolean matches(Class<?> clazz);
	
	ClassFilter TRUE = TrueClassFilter.INSTANCE;
}
