package com.wilson.spring.aop;

import java.io.Serializable;

@SuppressWarnings("serial")
class TruePointCut implements PointCut, Serializable {

	public static final TruePointCut INSTANCE = new TruePointCut();
	
	private TruePointCut() {
	}
	
	@Override
	public ClassFilter getClassFilter() {
		return ClassFilter.TRUE;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return MethodMatcher.TRUE;
	}

	private Object readResolve() {
		return INSTANCE;
	}
	
	@Override
	public String toString() {
		return "PointCut.TRUE";
	}
	
}
