package org.aopalliance.intercept;

import java.lang.reflect.Constructor;

public interface ConstructorInvocation extends Invocation {
	public abstract Constructor<?> getConstructor();
}
