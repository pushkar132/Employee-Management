package com.pushkarlunawat.employeecrud.service;

import com.pushkarlunawat.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findEmployeeById(int id);
    public void addEmployee(Employee employee);
    public void update(Employee employee);
    public void deleteById(int id);
}

