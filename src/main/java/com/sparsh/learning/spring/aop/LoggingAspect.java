package com.sparsh.learning.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author prashant.swamy
 *
 */

@Aspect
public class LoggingAspect {

    /*
     * @Before("getNamePointCut()") public void LoggingBeforeAdvice() { System.out.println("Inside the LoggingBeforeAdvice."); }
     * @After("getNamePointCut()") public void LoggingAfterAdvice() { System.out.println("Inside the LoggingAfterAdvice."); }
     */

    @Around("getNamePointCut()")
    public void LoggingAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // Object object = joinPoint.getTarget();

        Signature signature = joinPoint.getSignature();
        System.out.println("Name: " + signature.getName());
        System.out.println("DeclaringTypeName: " + signature.getDeclaringTypeName());
        System.out.println("getModifiers: " + signature.getModifiers());

        joinPoint.proceed();

        System.out.println("After the advice.");

    }

    @Pointcut("execution(public String getName())")
    public void getNamePointCut() {
    }

}
