package com.assesment.assesmentsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {

    @GetMapping("/")
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView("cat");
        String str ="Ioana";
        model.addAttribute("user", str);
        return mv;
    }


    @GetMapping("/fest")
    public String index2(Model model) {
        ModelAndView mv = new ModelAndView("cat");
        String str ="Ioana";
        model.addAttribute("user", str);
        return "cat";
    }

}
