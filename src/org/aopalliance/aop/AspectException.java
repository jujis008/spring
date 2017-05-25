package org.aopalliance.aop;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class AspectException extends RuntimeException {

	/**
	 * default serial number
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private String stackTrace;
	private Throwable throwable;
	public String getMessage() {
		return message;
	}
	public Throwable getCause() {
		return throwable;
	}
	
	public void printStackTrace(){
		System.err.println(this.stackTrace);
	}
	
	public void printStackTrace(PrintStream paramPrintStream) {
		paramPrintStream.print(this.stackTrace);
	};
	
	@Override
	public void printStackTrace(PrintWriter paramPrintWriter) {
		paramPrintWriter.print(this.stackTrace);
	}
	
	public AspectException(String message) {
		super(message);
		this.message = message;
		this.stackTrace = message;
	}
	
	public AspectException(String message, Throwable throwable) {
		super(message + "; nested exception is " + throwable.getMessage());
		this.throwable = throwable;
		StringWriter localStringWriter = new StringWriter();
		throwable.printStackTrace(new PrintWriter(localStringWriter));
		this.stackTrace = localStringWriter.toString();
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}
