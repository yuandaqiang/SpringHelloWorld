package com.tutorialspoint;

public class Logging {
    public void beforeAdvice()
    {
        System.out.println("Logging beforeAdvice");
    }
    public void afterAdvice()
    {
        System.out.println("Logging afterAdvice");
    }
    public void afterReturningAdvice(Object retVal)
    {
        System.out.println("Logging afterReturningAdvice:"+retVal.toString());
    }
    public void afterThrowingAdvice(IllegalArgumentException ex)
    {
        System.out.println("Logging afterThrowingAdvice:"+ex.toString());
    }
    public int print(int i)
    {
        System.out.println("logging print");
        return 0;
    }
}
