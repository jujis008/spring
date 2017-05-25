package com.wilson.spring.aop;

import org.aopalliance.aop.Advice;

public interface DynamicIntroduceAdvice extends Advice {
	boolean implementsInterface(Class<?> intf);
}
