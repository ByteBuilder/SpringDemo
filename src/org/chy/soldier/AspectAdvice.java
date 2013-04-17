package org.chy.soldier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectAdvice {

	public void doBefore(JoinPoint jp) {
		System.out.println("doBefore");
	}

    public void doAfter(JoinPoint jp, String result) {
    	System.out.println("doAfter");
    }

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
    	
    	System.out.println("doAround");
    }

    public void doThrow(JoinPoint jp, Throwable e) {
        System.out.println("doThrow");
    }
}
