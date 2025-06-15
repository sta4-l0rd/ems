package com.sta4l0rd.ems.service;

import com.sta4l0rd.ems.empDTO.EmployeeAllDetailsDTO;
import com.sta4l0rd.ems.empDTO.EmployeesListDTO;
import com.sta4l0rd.ems.entity.Employee;

public interface EmployeeService {
    public EmployeesListDTO getAllEmployees();
    public EmployeeAllDetailsDTO createEmployee(EmployeeAllDetailsDTO employeeAllDetailsDTO);
}
