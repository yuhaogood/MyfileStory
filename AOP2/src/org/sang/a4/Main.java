package org.sang.a4;

import org.sang.a3.MyCalculate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/11.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        HaoPlay haoPlay = (HaoPlay) cpxa.getBean("haoPlay");
        haoPlay.play("游戏");
        MyCalculate calculate = (MyCalculate) cpxa.getBean("calculate");
        calculate.add(1, 2);
        calculate.min(3, 4);
        calculate.sayHello();
    }
}
