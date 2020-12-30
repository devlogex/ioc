package com.tnd.test.ioc.reflection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemo {
    public static void main(String ...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Configuration.class);
        context.register(InstantiationTracingBeanPostProcessor.class);
        context.refresh();
        Controller controller =  context.getBean(Controller.class);
        System.out.println(controller.send());
    }
}
