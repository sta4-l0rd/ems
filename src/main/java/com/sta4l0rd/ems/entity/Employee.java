package com.sta4l0rd.ems.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String dept;
    private double salary;
    private LocalDate dateOfJoinng;

    public Employee(String name, String dept, double salary, LocalDate dateOfJoinng) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.dateOfJoinng = dateOfJoinng;
    }

    public Employee() {
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
