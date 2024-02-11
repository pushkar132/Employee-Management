package com.pushkarlunawat.employeecrud.controller;

import com.pushkarlunawat.employeecrud.entity.Employee;
import com.pushkarlunawat.employeecrud.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees") //base mapping for url requests
public class EmployeeController {
    private EmployeeService employeeService;

    //only one constructor so @Autowired is optional
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //mapping for getting the list of employees
    @GetMapping("/list")
    public String listEmployees(Model model){
        //getting employees from the database
        List<Employee> employees= employeeService.findAll();
        //adding the employees to spring model
        model.addAttribute("employees",employees);
        return "employees/employees-list";
    }
    @GetMapping("/newEmployee")
    public String newEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employees/employee-form";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        //save the employee
        employeeService.addEmployee(employee);
        //use redirect to prevent duplicate submission
        return "redirect:/employees/list";
    }
    @GetMapping("/update")
    public String updateEmployee(@RequestParam("empId") int id,Model model){
        model.addAttribute("employee",employeeService.findEmployeeById(id));
        return "employees/employee-form";
    }
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
