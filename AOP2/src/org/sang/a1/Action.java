package org.sang.a1;

import java.lang.annotation.*;

/**
 * Created by sang on 2017/5/5.
 */
@Target(ElementType.METHOD)//该注解使用在方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() default "aa";
}
