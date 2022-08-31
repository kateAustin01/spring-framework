package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        //model methods



        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
     /*   model.addAttribute("subject","Cydeo");
        model.addAttribute("id","Cydeo");
        model.addAttribute("numbers","Cydeo");
        model.addAttribute("numbers.get(0)","Cydeo");
        model.addAttribute("student.firstName","Cydeo");
        model.addAttribute("student.lastName","Cydeo");*/


      return "/student/welcome";
    }
}
