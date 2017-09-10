package org.sang.a1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by sang on 2017/5/5.
 */
@Configuration
@ComponentScan("org.sang.a1")
@EnableAspectJAutoProxy
public class MyConfig {

}
