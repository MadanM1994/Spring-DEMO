package com.madan.demo.service;

import com.madan.demo.Employees;
import com.madan.demo.dao.EmployeesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    private final EmployeesDao employeesDao;

    @Autowired
    public EmployeesService(EmployeesDao employeesDao) {
        this.employeesDao = employeesDao;
    }

    public List<Employees> getEmployees() {
       return employeesDao.findAll();
    }

    public Employees getEmployeeById(int id) {
        Optional<Employees> optionalEmployee= employeesDao.findById(id);
        return optionalEmployee.orElse(null);
    }

    public String AddEmployee(Employees employee) {
        employeesDao.save(employee);
        return "Sucessfully posted";
    }
    public String deleteById(int id) {
        employeesDao.deleteById(id);
        return "Deleted";
    }
//
//    public String updateById(int id, Employees employee ) {
//        Optional<Employees> optionalEmployee= employeesDao.findById(id);
//        if (optionalEmployee.isPresent()){
//            employee.setEmployerId(id);
//            employeesDao.save(employee);
//            return "Updated";
//        }
//        return  "Record nor found";
//    }
//
//    public  String addEmployeeById(int id, Employees employee) {
//        Optional<Employees> optionalEmployer = employeesDao.findById(id);
//        if (optionalEmployer.isPresent()){
//            return"There is an existing record with that ID. Please select path add/employee";
//        }
//        employee.setEmployerId(id);
//        employeesDao.save(employee);
//        return "Sucesfully added new record to the Id";
//
//    }

}
