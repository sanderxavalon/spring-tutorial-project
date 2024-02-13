package com.tibame.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JointPoint {
	
    @Before("execution(* com.tibame.tutorial.beans.*.speak*())")
    public void jointpointBefore() {
        System.out.println("Before");
    }
    
    @After("execution(* com.tibame.tutorial.beans.*.bye*())")
    public void jointpointAfterFinally() {
        System.out.println("After Finally");
    }
    
    @AfterReturning(
        pointcut="execution(* com.tibame.tutorial.beans.*.return*())",
        returning="retVal")
    public void jointpointAfterReturn(String retVal) {
        System.out.println("jointpointAfterReturn: " + retVal);
    }
    
    @AfterThrowing(
    		pointcut = "execution(* com.tibame.tutorial.beans.*.throw*())",
    		throwing = "ex")
    public void jointpointAfterThrow(Exception ex) {
        System.out.println("AOP After Throw");
        System.out.println(ex.toString());
    }
    
    @Around("execution(* com.tibame.tutorial.beans.*.*())")
    public Object jointpointAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
//        You can intercept the exception.
//        Object retVal = null;
//        try {
//        	retVal = pjp.proceed();
//        } catch (Exception e) {
//			System.out.println("Catch Error:" + e.toString());
//		}
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }
}