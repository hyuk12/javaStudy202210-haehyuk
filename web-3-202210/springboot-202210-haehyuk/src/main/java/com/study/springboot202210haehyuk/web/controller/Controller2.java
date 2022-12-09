package com.study.springboot202210haehyuk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {

    @GetMapping("/controller/2")
    public String load(Model model) {
        model.addAttribute("name", "최해혁");
        return "controller_test";
    }
}

