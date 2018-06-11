package com.tutorialspoint;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging2 {
    @Pointcut("execution(* com.tutorialspoint.*.*(..))")
    private void selectAll(){}
    @Before("selectAll()")
    public void beforeAdvice()
    {
        System.out.println("Logging2 beforeAdvice");
    }
    @After("selectAll()")
    public void afterAdvice()
    {
        System.out.println("Logging2 afterAdvice");
    }
    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal)
    {
        System.out.println("Logging2 afterReturningAdvice:"+retVal.toString());
    }
    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex)
    {
        System.out.println("Logging2 afterThrowingAdvice:"+ex.toString());
    }
}
