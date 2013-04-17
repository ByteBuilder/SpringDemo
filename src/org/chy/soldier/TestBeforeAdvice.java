package org.chy.soldier;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class TestBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg2.toString() + " 's method " + arg0.getName() + " is called");
	}

}
