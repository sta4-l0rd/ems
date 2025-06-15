package com.sta4l0rd.ems.empDTO;

import java.time.LocalDate;

public class EmployeeAllDetailsDTO {
    private String name;
    private String dept;
    private double salary;
    private LocalDate dateOfJoinng;
    
    public EmployeeAllDetailsDTO(String name, String dept, double salary, LocalDate dateOfJoinng) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.dateOfJoinng = dateOfJoinng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfJoinng() {
        return dateOfJoinng;
    }

    public void setDateOfJoinng(LocalDate dateOfJoinng) {
        this.dateOfJoinng = dateOfJoinng;
    }
    
}

