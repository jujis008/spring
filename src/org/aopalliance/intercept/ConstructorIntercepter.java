package org.aopalliance.intercept;

public interface ConstructorIntercepter extends Intercepter {
	public abstract Object construct(ConstructorInvocation constructorInvocation);
}
