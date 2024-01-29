package com.tibame.lab.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LabJointPoint {

    public void jointpointBefore() {
        System.out.println("Before");
    }
    
    public void jointpointAfterFinally() {
        System.out.println("After Finally");
    }
    
    public void jointpointAfterReturn(String retVal) {
        System.out.println("jointpointAfterReturn: " + retVal);
    }
    
    public void jointpointAfterThrow(Exception ex) {
        System.out.println("AOP After Throw");
        System.out.println(ex.toString());
    }
    
    public Object jointpointAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }

}
