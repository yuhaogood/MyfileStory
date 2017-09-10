package org.sang.a3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by sang on 2017/5/5.
 */
public class XMLAdvice {
    public void before1(JoinPoint joinPoint) {
        String name = ((MethodSignature) joinPoint.getSignature()).getName();
        System.out.println(name + "方法执行之前");
    }
    public Object around1(ProceedingJoinPoint pjp) throws Throwable {
        String name = ((MethodSignature) pjp.getSignature()).getName();
//       pjp.getSignature().getClass().getCanonicalName();
        String className =    pjp.getSourceLocation().getWithinType().getName();
        long start = System.nanoTime();
//        System.out.println("环绕通知"+className+":"+name+"执行之前");
        Object proceed = pjp.proceed();
        long end = System.nanoTime();

        System.out.println("环绕通知"+className+":"+name+"执行之后"+(end-start));
        return proceed;
    }
    public void after1(JoinPoint joinPoint) {
        String name = ((MethodSignature) joinPoint.getSignature()).getName();
        System.out.println(name + "方法执行之后");
    }
    public void return1(Object result) {
        System.out.println("------"+result);
    }
    public void throwing1(Exception e) {
        System.out.println(e.getLocalizedMessage());
    }
}
