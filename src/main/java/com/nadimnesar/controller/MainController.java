package com.nadimnesar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView getHomePage(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("welcome_msg", "Welcome to Spring MVC Project");
        return modelAndView;
    }
}