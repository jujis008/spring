package com.wilson.spring.aop;

import java.lang.reflect.Method;

public interface IntroductionAwareMethodMatcher extends MethodMatcher {
	boolean matches(Method method, Class<?> targetClass, boolean hasIntroductions);
}
