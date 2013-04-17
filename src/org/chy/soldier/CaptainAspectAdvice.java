package org.chy.soldier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CaptainAspectAdvice {

	public void doBefore(JoinPoint jp) {
		System.out.println("Captain doBefore");
	}

    public void doAfter(JoinPoint jp, String result) {
    	System.out.println("Captain doAfter");
    }

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
    	pjp.proceed();
    	System.out.println("Captain doAround");
    }

    public void doThrow(JoinPoint jp, Throwable e) {
        System.out.println("Captain doThrow");
    }
}
