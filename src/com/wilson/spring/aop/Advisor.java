package com.wilson.spring.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {
	Advice getAdvice();
	
	boolean isPerInstance();
}
