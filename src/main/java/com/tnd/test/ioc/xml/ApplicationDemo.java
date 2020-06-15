package com.tnd.test.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDemo {
    public static void main(String ...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Controller controller = (Controller) context.getBean("controller");
        System.out.println(controller.send());
    }
}
