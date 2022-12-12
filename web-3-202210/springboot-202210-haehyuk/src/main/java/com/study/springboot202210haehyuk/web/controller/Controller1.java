package com.study.springboot202210haehyuk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

    @GetMapping("/page1")
    public ModelAndView page1 () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page1");
        mv.addObject("key", "value");
        return mv;

        // 테스트

    }

    @GetMapping("/page2")
    public String page2 () {
        return "page2";
    }

}
