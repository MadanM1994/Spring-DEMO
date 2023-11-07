//package com.madan.demo;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "departments")
//public class Departments {
//
//    @Id
//    @Column(name = "department_id")
//    private int departmentId;
//
//    @Column(name = "department_name")
//    private String departmentName;
//
//    public int getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(int departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    @Override
//    public String toString() {
//        return "Departments{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                '}';
//    }
//}
