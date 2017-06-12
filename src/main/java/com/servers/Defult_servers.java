package com.chinactOA.servers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/7.
 */
public interface Defult_servers {
    public static ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context/beans.xml");
}
