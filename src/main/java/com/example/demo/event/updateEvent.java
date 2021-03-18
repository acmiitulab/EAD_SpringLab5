package com.example.demo.event;

import com.example.demo.models.Employee;
import org.springframework.context.ApplicationEvent;

public class updateEvent extends ApplicationEvent {
    private Employee employee;
    private Employee oldData;

    public updateEvent(Object source, Employee employee, Employee oldData) {
        super(source);
        this.employee = employee;
        this.oldData = oldData;
    }

    public Employee getOldData() {
        return oldData;
    }

    public Employee getEmployee() {
        return employee;
    }
}
