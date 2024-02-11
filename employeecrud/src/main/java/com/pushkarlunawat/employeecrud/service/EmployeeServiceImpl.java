package com.pushkarlunawat.employeecrud.service;

import com.pushkarlunawat.employeecrud.dao.EmployeeRepository;

import com.pushkarlunawat.employeecrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findEmployeeById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee=null;
        if(result.isPresent()){
            employee=result.get();
        }
        else {
            throw new RuntimeException("Employee with ID-"+id+" not found");
        }
        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
