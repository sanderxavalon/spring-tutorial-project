package com.tibame.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TutorialAspect {
	
    @Before("execution(* com.tibame.tutorial.beans.*.speak*())")
    public void concernBefore() {
        System.out.println("Before");
    }
    
    @After("execution(* com.tibame.tutorial.beans.*.bye*())")
    public void concernAfterFinally() {
        System.out.println("After Finally");
    }
    
    @AfterReturning(
        pointcut="execution(* com.tibame.tutorial.beans.*.return*())",
        returning="retVal")
    public void concernAfterReturn(String retVal) {
        System.out.println("jointpointAfterReturn: " + retVal);
    }
    
    @AfterThrowing(
    		pointcut = "execution(* com.tibame.tutorial.beans.*.throw*())",
    		throwing = "ex")
    public void concernAfterThrow(Exception ex) {
        System.out.println("AOP After Throw");
        System.out.println(ex.toString());
    }
    
    @Around("execution(* com.tibame.tutorial.beans.*.*())")
    public Object concernAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }
}