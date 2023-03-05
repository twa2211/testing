package com.jwd36.spBoot.training1.controller;

import com.jwd36.spBoot.training1.dao.EmployeeDao;
import com.jwd36.spBoot.training1.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @GetMapping({"/","/view","/list"})
    public ModelAndView viewList(){
        ModelAndView mav=new ModelAndView("employeeView");
        List<Employee> list=dao.findAll();
        mav.addObject("view",list);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView addEmploy(){
        ModelAndView mav=new ModelAndView("addEmployee");
        Employee em=new Employee();
        mav.addObject("employee",em);
        return mav;
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee){
        dao.save(employee);
        return "redirect:/list";
    }








}
