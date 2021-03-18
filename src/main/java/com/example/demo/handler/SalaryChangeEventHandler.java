package com.example.demo.handler;

import com.example.demo.event.updateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SalaryChangeEventHandler implements ApplicationListener<updateEvent> {

    @Override
    public void onApplicationEvent(updateEvent salaryChangeEvent) {
        System.out.println("\nupdateEventHandler.onApplicationEvent");
        System.out.println("New data");
        System.out.println("Employee:      " + salaryChangeEvent.getEmployee().getName());
        System.out.println("Salary update: " + salaryChangeEvent.getEmployee().getSalary() + "\n");

        System.out.println("Old data");
        System.out.println("Employee:      " + salaryChangeEvent.getOldData().getName());
        System.out.println("Salary update: " + salaryChangeEvent.getOldData().getSalary());
    }
}
