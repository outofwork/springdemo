package com.upwork.aspectprogramming;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.upwork.aspectprogramming.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("@Before beforeAdvice: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.upwork.aspectprogramming.*.*(..))", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("@AfterReturning afterReturningAdvice: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(* com.upwork.aspectprogramming.*.*(..))", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception) {
        System.out.println("@AfterThrowing afterThrowingAdvice: " + joinPoint.getSignature().getName());
    }

    @Around("execution(* com.upwork.aspectprogramming.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("@Around aroundAdvice: " + joinPoint.getSignature().getName());
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
        }
        return result;
    }
}


