package com.jbabineau.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(Model model){

        model.addAttribute("appName", "TWSS board!");
        model.addAttribute("classActiveHome", "active");
        return "index";
    }
}
