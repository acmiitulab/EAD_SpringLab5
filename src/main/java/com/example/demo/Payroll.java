package com.example.demo;

import com.example.demo.controller.EmployeeController;
import com.example.demo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("payrollSystem")
public class Payroll {

    private EmployeeController employeeController;

    @Autowired
    public Payroll(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void run() {

        System.out.println("Hello");

        employeeController.createEmployee(new Employee(0, "Somebody", 200));

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        Employee Somebody = employeeController.getSalariedEmployee(id);
        Somebody.setSalary(350);
        employeeController.updateEmployeeFixedSalary(Somebody);

    }
}
