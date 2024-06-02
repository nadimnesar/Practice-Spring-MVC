package com.nadimnesar.controller;

import com.nadimnesar.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView getHomePage(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("welcome_msg", "Welcome to Spring MVC Project");
        return modelAndView;
    }

    @PostMapping("/submit")
    public ModelAndView postSubmit(ModelAndView modelAndView, @ModelAttribute User user,
                                   RedirectAttributes redirectAttributes) {
        System.out.println(user);
        redirectAttributes.addFlashAttribute("success_msg",
                "Successfully added a new user info!");
        modelAndView.setViewName("redirect:/");

        return modelAndView;
    }
}