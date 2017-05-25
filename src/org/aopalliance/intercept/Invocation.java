package org.aopalliance.intercept;

public interface Invocation extends Joinpoint {
	public abstract Object[] getArguments();
}
