package org.chy.soldier;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TestAfterReturnAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg3.toString() + " 's method " + arg1.getName() + " has been called");
	}

}
