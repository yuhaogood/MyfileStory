package org.sang.a3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sang on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculate calculate = (MyCalculate) ctx.getBean("calculate");
        calculate.add(1, 2);
        calculate.min(3, 4);
        calculate.sayHello();
    }
}
