package com.tibame.tutorial.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {

    @After("execution(* com.tibame.tutorial.beans.*.*())")
    public void jointpointAfterFinally() {
        System.out.println("每個方法都加Log!");
    }

}
