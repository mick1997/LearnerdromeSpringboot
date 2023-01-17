package com.snva.learnerdromeappw.learnerdrome.controller;

import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.User;
import com.snva.learnerdromeappw.learnerdrome.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    IUserService iUserService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView home(ModelMap modelMap) {
        return new ModelAndView("home", "data", new Object());
    }

    @RequestMapping(path = "/addemployee", method = RequestMethod.GET)
    public ModelAndView employee(ModelMap modelMap) {
        User user = new User();
        user.setRoles(iUserService.getRole());
        return new ModelAndView("employee", "user", user);
    }
}
