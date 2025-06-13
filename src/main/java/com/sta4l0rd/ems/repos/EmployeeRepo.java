package com.sta4l0rd.ems.repos;

import org.springframework.data.repository.CrudRepository;

import com.sta4l0rd.ems.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{
    
}
