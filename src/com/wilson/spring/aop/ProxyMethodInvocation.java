package com.wilson.spring.aop;

import org.aopalliance.intercept.MethodInvocation;

public interface ProxyMethodInvocation extends MethodInvocation{
	Object getProxy();
	
	MethodInvocation invocableClone();
	
	MethodInvocation invocableClone(Object...arguments);
	
	void setArguments(Object...arguments);
	
	void setUserAttribute(String key, Object value);
	
	Object getUserAttribute(String key);
}
