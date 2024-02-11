package com.pushkarlunawat.employeecrud.dao;

import com.pushkarlunawat.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // methode to sort by last name
    //spring data jpa query method
    public List<Employee> findAllByOrderByLastNameAsc();
}
