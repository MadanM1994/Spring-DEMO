//package com.madan.demo;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "job_details")
//public class JobDetails {
//
//    @Id
//    @Column(name = "job_title_id")
//    private int jobId;
//
//    @Column(name = "hire_date")
//    private String hiringDate;
//
//    @Column(name = "job_status")
//    private char jobStatus;
//
//    @Column(name = "Department_id")
//    private String department;
//
//    @Column(name = "salary")
//    private double salary;
//
//    @Column(name = "job_title_id")
//    private char jobTitle;
//
//    @Column(name = "employer_id")
//    private char employerId;
//
//    @Column(name = "is_active")
//    private char active;
//
//    @Column(name = "is_deleted")
//    private char deleted;
//
//    public int getJobId() {
//        return jobId;
//    }
//
//    public void setJobId(int jobId) {
//        this.jobId = jobId;
//    }
//
//    public String getHiringDate() {
//        return hiringDate;
//    }
//
//    public void setHiringDate(String hiringDate) {
//        this.hiringDate = hiringDate;
//    }
//
//    public char getJobStatus() {
//        return jobStatus;
//    }
//
//    public void setJobStatus(char jobStatus) {
//        this.jobStatus = jobStatus;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public char getJobTitle() {
//        return jobTitle;
//    }
//
//    public void setJobTitle(char jobTitle) {
//        this.jobTitle = jobTitle;
//    }
//
//    public char getEmployerId() {
//        return employerId;
//    }
//
//    public void setEmployerId(char employerId) {
//        this.employerId = employerId;
//    }
//
//    public char getActive() {
//        return active;
//    }
//
//    public void setActive(char active) {
//        this.active = active;
//    }
//
//    public char getDeleted() {
//        return deleted;
//    }
//
//    public void setDeleted(char deleted) {
//        this.deleted = deleted;
//    }
//
//    @Override
//    public String toString() {
//        return "JobDetails{" +
//                "jobId=" + jobId +
//                ", hiringDate='" + hiringDate + '\'' +
//                ", jobStatus=" + jobStatus +
//                ", department='" + department + '\'' +
//                ", salary=" + salary +
//                ", jobTitle=" + jobTitle +
//                ", employerId=" + employerId +
//                ", active=" + active +
//                ", deleted=" + deleted +
//                '}';
//    }
//}
