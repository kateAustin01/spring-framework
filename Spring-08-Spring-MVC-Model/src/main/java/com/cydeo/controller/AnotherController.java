package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {
    @RequestMapping("/mentor")   //localhost:8080/another/mentor
    public String mentor(Model model){


        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",23, Gender.Male));
        mentorList.add(new Mentor("Bike","Smith",23, Gender.Male));
        mentorList.add(new Mentor("Like","Smith",23, Gender.Male));
        model.addAttribute("mentors",mentorList);
        return "mentor/mentor";
    }
}
