package com.sta4l0rd.ems.empDTO;

public class EmployeeDTO {
    private String name;
    private String dept;

    public EmployeeDTO(String name, String dept) {
        this.name = name;
        this.dept = dept;
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
}
