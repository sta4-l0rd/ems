package com.sta4l0rd.ems.empDTO;

import java.util.List;

public class EmployeesListDTO {
    private List<EmployeeDTO> listOfAllEmployees;

    public EmployeesListDTO(List<EmployeeDTO> listOfAllEmployees) {
        this.listOfAllEmployees = listOfAllEmployees;
    }

    public List<EmployeeDTO> getListOfAllEmployees() {
        return listOfAllEmployees;
    }

    public void setListOfAllEmployees(List<EmployeeDTO> listOfAllEmployees) {
        this.listOfAllEmployees = listOfAllEmployees;
    } 
}
