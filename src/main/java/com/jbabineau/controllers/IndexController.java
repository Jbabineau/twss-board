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
        model.addAttribute("header1", "index.header1");
        model.addAttribute("header2", "index.header2");
        model.addAttribute("header3", "index.header3");
        model.addAttribute("header4", "index.header4");
        model.addAttribute("text1", "index.text1");
        model.addAttribute("text2", "index.text2");
        model.addAttribute("text3", "index.text3");
        model.addAttribute("text4", "index.text4");
        return "index";
    }
}
