package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        //model methods
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");


        String subject = "Collections";

        model.addAttribute("subject", subject);

        //Create some random studentId(0-1000) and show it in your UI
        Random ran = new Random();
        int randomNumber = ran.nextInt(1000);
        model.addAttribute("id", randomNumber);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        model.addAttribute("numbers", numbers);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);

        return "/student/welcome";
    }

}
