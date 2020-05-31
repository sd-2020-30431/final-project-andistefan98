package com.assesment.assesmentsystem.controllers;

import com.assesment.assesmentsystem.bussines.LoginForm;
import com.assesment.assesmentsystem.data.entities.Admin;
import com.assesment.assesmentsystem.data.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    AdminRepository adminRepo;

    @RequestMapping(value ="/login", method = RequestMethod.GET)
    public String home(LoginForm loginForm)
    {
        return "login.html";
    }

    @RequestMapping(value ="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm")  LoginForm loginForm, RedirectAttributes atts)
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("adminPage");
        try{
            if(loginForm.getUsername()!=null &&loginForm.getPassword()!=null)
            {
                Admin admin= adminRepo.findByUsername(loginForm.getUsername());
                mav.addObject("admin",admin.getUsername());

                return "redirect:/admin";

            }
        }
        catch(Exception e)
        {

            return "profile.html";
        }

return "profile.html";

    }



}
