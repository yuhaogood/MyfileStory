package org.sang.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        MyCalculate calculate = (MyCalculate) ctx.getBean("myCalculateImpl");
        calculate.add(5, 6);
        calculate.min(7, 8);
        calculate.sayHello();
    }
}
