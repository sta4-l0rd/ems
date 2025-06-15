package com.sta4l0rd.ems.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sta4l0rd.ems.empDTO.EmployeeAllDetailsDTO;
import com.sta4l0rd.ems.empDTO.EmployeeDTO;
import com.sta4l0rd.ems.empDTO.EmployeesListDTO;
import com.sta4l0rd.ems.entity.Employee;
import com.sta4l0rd.ems.repos.EmployeeRepo;
import com.sta4l0rd.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeesListDTO getAllEmployees() {
        List<EmployeeDTO> employees = new ArrayList<>();
        for (Employee item : employeeRepo.findAll()) {
            employees.add(new EmployeeDTO(item.getName(), item.getDept()));
        }
        return new EmployeesListDTO(employees);
    }

    @Override
    public EmployeeAllDetailsDTO createEmployee(EmployeeAllDetailsDTO employeeAllDetailsDTO) {
        if (employeeAllDetailsDTO != null && employeeAllDetailsDTO.getName() != null
                && !employeeAllDetailsDTO.getName().isEmpty()) {
            employeeRepo.save(new Employee(employeeAllDetailsDTO.getName(), employeeAllDetailsDTO.getDept(),
                    employeeAllDetailsDTO.getSalary(), employeeAllDetailsDTO.getDateOfJoinng()));
            return employeeAllDetailsDTO;
        }
        else{
            return null;
        }
    }
}
