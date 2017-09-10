package org.sang.a1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MemberSignature;
import org.springframework.stereotype.Component;

/**
 * Created by sang on 2017/5/5.
 */
@Component
@Aspect//表示该类是一个切面
public class LogAspect {

    //定义切面
    @Pointcut("@annotation(org.sang.a1.Action)")
    public void pointcut1() {

    }

    //前置通知
    //@annotation(org.sang.a1.Action)表示拦截所有的带@Action注解的方法
    //@Before表示在拦截到的方法之前执行该方法
    @Before("pointcut1()")
    public void before1(JoinPoint joinPoint) {
        MemberSignature signature = (MemberSignature) joinPoint.getSignature();
        //获取拦截到的方法名
        String name = signature.getName();
        System.out.println(name + "方法执行之前");
    }

    //后置通知
    @After("pointcut1()")
    public void after1(JoinPoint joinPoint) {
        String name = ((MemberSignature) joinPoint.getSignature()).getName();
        System.out.println(name + "方法执行结束");
    }

    //返回通知
    //注意：JoinPoint joinPoint写为第一个参数
    @AfterReturning(value = "pointcut1()", returning = "result")
    public void return1(JoinPoint joinPoint, Object result) {
        System.out.println(result);
    }

    //异常通知
    @AfterThrowing(value = "pointcut1()", throwing = "e")
    public void mythrowing(JoinPoint joinPoint, Exception e) {
        System.out.println("捕获到异常了 ---" + e.getLocalizedMessage());
    }

    //环绕通知
    @Around("pointcut1()")
    public Object around1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-------------");
        Object proceed = pjp.proceed();
        System.out.println("+++++++++++++++++");
        return proceed;
    }
}
