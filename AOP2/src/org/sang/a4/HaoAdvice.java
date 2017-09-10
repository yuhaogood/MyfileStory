package org.sang.a4;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2017/9/11.
 */
public class HaoAdvice {
    public Object aroundHao(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String fileName = proceedingJoinPoint.getSourceLocation().getWithinType().getName();
        String methonName = proceedingJoinPoint.getSignature().getName();

        long start = System.nanoTime();
        Object proceed = proceedingJoinPoint.proceed();
        long end = System.nanoTime();
        System.out.println(fileName+"----"+methonName+"执行时长："+(end-start));
        return proceed;
    }
}
