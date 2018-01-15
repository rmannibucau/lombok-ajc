package com.github.rmannibucau.sample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SomeAspect {
    @Around("execution(* com.github.rmannibucau.sample.Demo.sayHi(..)) || " +
            "execution(* com.github.rmannibucau.sample.Demo.getName())")
    public Object monitor(final ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before > " + pjp.getSignature());
        return pjp.proceed();
    }
}
