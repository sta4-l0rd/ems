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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private LocalDate dateOfJoinng;

    public LocalDate getDateOfJoinng() {
        return dateOfJoinng;
    }

    public void setDateOfJoinng(LocalDate dateOfJoinng) {
        this.dateOfJoinng = dateOfJoinng;
    }

    public Employee(Long id, String name, String dept, double salary, LocalDate dateOfJoinng) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.dateOfJoinng = dateOfJoinng;
    }

    public Employee() {
    }

}
