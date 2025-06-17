package com.sta4l0rd.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sta4l0rd.ems.empDTO.EmployeeAllDetailsDTO;
import com.sta4l0rd.ems.service.serviceImpl.EmployeeServiceImpl;

@Controller
@RequestMapping("")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl eImpl;

    @GetMapping("/employee-list")
    public String getAll(Model model) {
        model.addAttribute("employees", eImpl.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/new-employee-form")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new EmployeeAllDetailsDTO());
        return "add-employee";
    }

    @PostMapping("/new-employee")
    public String createEmployee(@ModelAttribute EmployeeAllDetailsDTO newEmployee, Model model) {
        if (eImpl.createEmployee(newEmployee) != null) {
            return "redirect:/employee-list";
        } else {
            model.addAttribute("error", "Failed to create employee. Please check your input.");
            return "add-employee";
        }
    }
}
