package org.sang.a2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by sang on 2017/5/5.
 */
@Component
@Aspect
public class LogAspect {
    //第一个int表示方法的返回值为int类型，注意：第一个int和后面的包名之间有一个空格
    //
    @Before("execution(int org.sang.a2.MyCalculateImpl.add(int,int) )")//表示拦截MyCalculateImpl类中的add方法
    public void before1() {
        System.out.println("add方法执行之前");
    }

    //第一个*表示方法的返回值任意
    //第二个*表示方法名称任意
    //最后两个点表示方法参数任意
    @After(value = "pointcut1()")
    public void after1() {
        System.out.println("方法执行之后");
    }

    @Pointcut("execution(* org.sang.a2.MyCalculateImpl.*(..))")
    public void pointcut1() {

    }
}
