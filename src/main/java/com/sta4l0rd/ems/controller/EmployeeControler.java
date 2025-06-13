package com.sta4l0rd.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sta4l0rd.ems.entity.Employee;
import com.sta4l0rd.ems.service.serviceImpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeControler {

    @Autowired
    EmployeeServiceImpl emp;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(emp.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createEmployee(@RequestBody Employee newEntry) {
        emp.createEmployee(newEntry);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
