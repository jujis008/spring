package com.wilson.spring.aop;

import java.io.Serializable;


@SuppressWarnings("serial")
class TrueClassFilter implements ClassFilter, Serializable {

	public static final TrueClassFilter INSTANCE = new TrueClassFilter();
	
	private TrueClassFilter() {
	}
	
	@Override
	public boolean matches(Class<?> clazz) {
		return true;
	}

	private Object readResolve() {
		return INSTANCE;
	}
	
	@Override
	public String toString() {
		return "ClassFilter.TRUE";
	}
}
