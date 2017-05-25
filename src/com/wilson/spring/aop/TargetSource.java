package com.wilson.spring.aop;

public interface TargetSource extends TargetClassAware {
	Class<?> getTargetClass();
	
	boolean isStatic();
	
	Object getTarget() throws Exception;
	
	void releaseTarget(Object target) throws Exception;
}
