package com.tibame.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class JointPoint {
	
    public void jointpointBefore() {
        System.out.println("Before");
    }
    
    public void jointpointAfterFinally() {
        System.out.println("After Finally");
    }
    
    public void jointpointAfterReturn(String retVal) {
        System.out.println(retVal);
    }
    
    public void jointpointAfterThrow(Exception exception) {
        System.out.println("After Throw");
    }
    
    public Object jointpointAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
//      You can intercept the exception.
//      Object retVal = null;
//      try {
//      	retVal = pjp.proceed();
//      } catch (Exception e) {
//			System.out.println("Catch Error:" + e.toString());
//		}
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }
}