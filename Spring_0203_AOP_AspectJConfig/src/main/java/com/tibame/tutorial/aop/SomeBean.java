package com.tibame.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomeBean {
	
    @Before("execution(* com.tibame.tutorial.beans.*.*())")
    public void jointpointBefore() {
        System.out.println("Before");
    }
    
    @After("execution(* com.tibame.tutorial.beans.*.*())")
    public void jointpointAfterFinally() {
        System.out.println("After Finally");
    }
    
    @AfterReturning(
        pointcut="execution(* com.tibame.tutorial.beans.*.*())",
        returning="retVal")
    public void jointpointAfterReturn(String retVal) {
        System.out.println(retVal);
    }
    
    @AfterThrowing("execution(* com.tibame.tutorial.beans.*.*())")
    public void jointpointAfterThrow() {
        System.out.println("After Throw");
    }
    
    @Around("execution(* com.tibame.tutorial.beans.*.*())")
    public Object jointpointAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }
}