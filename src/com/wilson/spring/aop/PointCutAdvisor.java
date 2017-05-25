package com.wilson.spring.aop;

public interface PointCutAdvisor extends Advisor {
	PointCut getPointCut();
}
