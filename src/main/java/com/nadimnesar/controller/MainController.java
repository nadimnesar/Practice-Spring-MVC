package com.nadimnesar.controller;

import com.nadimnesar.model.User;
import com.nadimnesar.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ModelAndView getHomePage(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("welcomeMsg", "Welcome to Spring MVC Project");
        return modelAndView;
    }

    @PostMapping("/submit")
    public ModelAndView postSubmit(ModelAndView modelAndView, @ModelAttribute User user,
                                   RedirectAttributes redirectAttributes) {
        userService.addUser(user);
        redirectAttributes.addFlashAttribute("successMsg",
                "Successfully added a new user info!");
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @GetMapping("/allUser")
    public ModelAndView getAllUserPage(ModelAndView modelAndView) {
        modelAndView.setViewName("allUser");
        modelAndView.addObject("userList", userService.getUserList());
        return modelAndView;
    }
}