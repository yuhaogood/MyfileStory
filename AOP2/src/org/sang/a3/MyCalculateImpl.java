package org.sang.a3;

/**
 * Created by sang on 2017/5/5.
 */
public class MyCalculateImpl implements MyCalculate {
    @Override
    public int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
    public int min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
//        int i = 1 / 0;
        return a - b;
    }
    public String sayHello() {
        System.out.println("hello AOP");
        return "hello AOP";
    }
}
