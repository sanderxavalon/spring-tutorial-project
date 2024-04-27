package com.tibame.lab.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LabJointPoint {

    public void labBefore() {
        System.out.println("Before");
    }
    
    public void labAfterFinally() {
        System.out.println("After Finally");
    }
    
    public void labAfterReturn(String retVal) {
        System.out.println("jointpointAfterReturn: " + retVal);
    }
    
    public void labAfterThrow(Exception ex) {
        System.out.println("AOP After Throw");
        System.out.println(ex.toString());
    }
    
    public Object labAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Around啟動!!");
        Object retVal = pjp.proceed();
        System.out.println("耗時:" + (System.currentTimeMillis() - start) + "ms");
        return retVal;
    }

}
