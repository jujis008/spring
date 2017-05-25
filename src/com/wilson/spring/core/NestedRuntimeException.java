package com.wilson.spring.core;

public abstract class NestedRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 847555049376456571L;
	
	static {
		NestedExceptionUtils.class.getName();
	}
	
	public NestedRuntimeException(String message) {
		super(message);
	}
	
	public NestedRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public String getMessage() {
		return NestedExceptionUtils.buildMessage(super.getMessage(), getCause());
	}
	
	public Throwable getRootCause() {
		Throwable rootCause = null;
		Throwable cause = getCause();
		while (cause != null && cause != rootCause) {
			rootCause = cause;
			cause = cause.getCause();
		}
		return rootCause;
	}
	
	public Throwable getMostSpecificCause() {
		Throwable rootCause = getRootCause();
		return (rootCause != null ? rootCause : this);
	}
	
	public boolean contains(Class<?> type) {
		if (type == null) {
			return false;
		}
		if (type.isInstance(this)) {
			return true;
		}
		Throwable cause = getCause();
		if (cause == this) {
			return false;
		}
		if (cause instanceof NestedRuntimeException) {
			return ((NestedRuntimeException) cause).contains(type);
		} else {
			while (cause != null) {
				if (type.isInstance(cause)) {
					return true;
				}
				if (cause.getCause() == cause) {
					break;
				}
				cause = cause.getCause();
			}
			return false;
		}
	}
}
