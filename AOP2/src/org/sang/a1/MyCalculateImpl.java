package org.sang.a1;

import org.springframework.stereotype.Component;

/**
 * Created by sang on 2017/5/5.
 */
@Component("myCalculateImpl")
public class MyCalculateImpl implements MyCalculate {
    @Override
    @Action
    public int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
    @Action
    public int min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
//        int i = 1 / 0;
        return a - b;
    }
    @Action
    public String sayHello() {
        return "hello AOP";
    }
}
