package com.assesment.assesmentsystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

   /* @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cat");
        return mv;
    }*/

     @RequestMapping(value = "/cat", method = RequestMethod.GET)
    public String home(ModelMap md) {
        //ModelAndView mv = new ModelAndView();
         md.addAttribute("name","bag");
        return "name";
    }

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String createLoginForm(HttpServletResponse response){
        response.setHeader("Content-Type","cat/html");
        return "cat.html";
    }*/

   /* @RequestMapping("/ff")
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView("cat");
        //String str ="Ioana";
        //model.addAttribute("user", str);
        return mv;
    }*/

}
