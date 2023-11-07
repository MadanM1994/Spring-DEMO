package com.madan.demo.dao;

import com.madan.demo.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDao extends JpaRepository <Employees, Integer> {
}
