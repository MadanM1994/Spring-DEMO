package com.madan.demo.controller;

import com.madan.demo.Employees;
import com.madan.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("employees")
public class EmployeesController {

    private final EmployeesService employeesService;


    @Autowired
       public EmployeesController (EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("allemployees")
    public List<Employees> AllEmployees(){
        return employeesService.getEmployees();
    }

    @GetMapping("employee/{id}")
    public Employees EmployeeById(@PathVariable int id){
        return employeesService.getEmployeeById(id);
    }

    @PostMapping("add/employee")
    public String AddEmployee(@RequestBody Employees employee){
        return employeesService.AddEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    public String DeleteById(@PathVariable int id){
        return employeesService.deleteById(id);
    }
//
//    @PutMapping("update/{id}")
//    public String UpdateById(@PathVariable int id, @RequestBody Employees employee){
//        return employeesService.updateById(id, employee);
//    }
//
//    @PutMapping("add/employee/{id}")
//    public String AddEmployeeById(@PathVariable int id, @RequestBody Employees employee ){
//        return employeesService.addEmployeeById(id, employee);
//    }
}
