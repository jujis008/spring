package com.wilson.spring.core;

public abstract class NestedExceptionUtils {
	public static String buildMessage(String message, Throwable cause) {
		if (cause != null) {
			StringBuilder builder = new StringBuilder();
			if (message != null) {
				builder.append(message).append("; ");
			}
			builder.append("nested exception is ").append(cause);
			return builder.toString();
		} else {
			return message;
		}
	}
}
