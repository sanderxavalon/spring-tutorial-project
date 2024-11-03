package com.tibame.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class TutorialAspect {
	
    public void concernBefore() {
        System.out.println("Before");
    }
    
    public void concernAfterFinally() {
        System.out.println("After Finally");
    }
    
    public void concernAfterReturn(String retVal) {
        System.out.println(retVal);
    }
    
    public void concernAfterThrow(Exception exception) {
        System.out.println("After Throw");
    }
    
    public Object concernAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }
}