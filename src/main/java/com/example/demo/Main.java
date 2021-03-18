package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfigration.class);
        Payroll payroll = context.getBean("payrollSystem", Payroll.class);
        payroll.run();

        context.registerShutdownHook();
    }
}
