package com.sta4l0rd.ems.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sta4l0rd.ems.entity.Employee;
import com.sta4l0rd.ems.repos.EmployeeRepo;
import com.sta4l0rd.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Employee item : employeeRepo.findAll()) {
            allEmployees.add(item);
        }
        return allEmployees;
    }

    public void createEmployee(Employee emp){
        employeeRepo.save(emp);
    }
}
