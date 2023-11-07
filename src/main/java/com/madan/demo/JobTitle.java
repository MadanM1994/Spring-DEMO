//package com.madan.demo;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "job_title")
//public class JobTitle {
//
//    @Id
//    @Column(name = "job_title_id")
//    private int jobTitleId;
//
//    @Column(name = "job_title")
//    private String job;
//
//    public int getJobTitleId() {
//        return jobTitleId;
//    }
//
//    public void setJobTitleId(int jobId) {
//        this.jobTitleId = jobId;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    @Override
//    public String toString() {
//        return "JobTitle{" +
//                "jobId=" + jobTitleId +
//                ", job='" + job + '\'' +
//                '}';
//    }
//}
