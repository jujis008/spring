package com.wilson.spring.aop;

public interface PointCut {
	ClassFilter getClassFilter();
	
	MethodMatcher getMethodMatcher();
	
	PointCut TRUE = TruePointCut.INSTANCE;
}
