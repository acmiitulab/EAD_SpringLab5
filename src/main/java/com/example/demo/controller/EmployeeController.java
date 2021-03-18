package com.example.demo.controller;

import com.example.demo.event.updateEvent;
import com.example.demo.models.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    public Employee getSalariedEmployee(Integer id) {
        return employeeService.getEmployeeByID(id);
    }

    public void updateEmployeeFixedSalary(Employee employee) {
        Employee oldEmpl = getSalariedEmployee(employee.getId());

        this.employeeService.updateEmployeeSalary(employee);

        this.eventPublisher.publishEvent(new updateEvent(this, employee, oldEmpl));
    }


    public void createEmployee(Employee employee) {
        this.employeeService.updateEmployeeSalary(employee);
    }
}
