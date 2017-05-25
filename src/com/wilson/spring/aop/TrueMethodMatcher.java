package com.wilson.spring.aop;

import java.io.Serializable;
import java.lang.reflect.Method;

@SuppressWarnings("serial")
class TrueMethodMatcher implements MethodMatcher, Serializable {

	public static final TrueMethodMatcher INSTANCE = new TrueMethodMatcher();
	
	private TrueMethodMatcher() {
	}
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return true;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isRuntime() {
		return false;
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
	
	@Override
	public String toString() {
		return "MethodMatcher.TRUE";
	}
}
