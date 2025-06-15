package com.sta4l0rd.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sta4l0rd.ems.empDTO.EmployeeAllDetailsDTO;
import com.sta4l0rd.ems.service.serviceImpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/ui-api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl eImpl;

    @GetMapping("/employee-list")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(eImpl.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/new-employee")
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeAllDetailsDTO newEmployee) {
        if(eImpl.createEmployee(newEmployee)!= null){
            return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
