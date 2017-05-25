package com.wilson.spring.aop;

public interface IntroductionAdvisor extends Advisor, IntroductionInfo {
	ClassFilter getClassFilter();
	
	void validateInterfaces() throws IllegalArgumentException;
}
