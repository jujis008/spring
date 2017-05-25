package org.aopalliance.intercept;

public interface MethodIntercepter extends Intercepter {
	public abstract Object invoke(MethodInvocation methodInvocation) throws Throwable;
}
