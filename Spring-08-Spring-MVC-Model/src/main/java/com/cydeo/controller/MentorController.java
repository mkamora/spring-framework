package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String showTable(Model model) {

        model.addAttribute("firstName", "First Name");
        model.addAttribute("lastName", "Last Name");
        model.addAttribute("age", "Age");
        model.addAttribute("gender", "Gender");

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
        mentorList.add(new Mentor("Amy", "Bryan", 25, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "/mentor/mentor-list";
    }

}