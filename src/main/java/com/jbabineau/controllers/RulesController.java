package com.jbabineau.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RulesController {

    @RequestMapping("/rules")
    public String getRules(Model model) {
        model.addAttribute("classActiveRules", "active");
        return "rules";
    }
}
