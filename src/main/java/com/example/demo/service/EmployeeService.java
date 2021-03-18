package com.example.demo.service;

import com.example.demo.models.Employee;

public interface EmployeeService {
    Employee getEmployeeByID (Integer id);
    void updateEmployeeSalary(Employee employee);
}
