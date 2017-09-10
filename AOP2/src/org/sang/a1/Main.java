package org.sang.a1;

import org.sang.a1.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 2017/5/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        MyCalculate myCalculateImpl = (MyCalculate) ctx.getBean("myCalculateImpl");
        int add = myCalculateImpl.add(5, 6);
        System.out.println("add:"+add);
        myCalculateImpl.min(7, 8);
        myCalculateImpl.sayHello();
    }
}
