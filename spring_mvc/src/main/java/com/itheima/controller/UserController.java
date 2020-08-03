package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @program: spring_mvc
 * @description: TODO
 * @author: Xiaofei Wang
 * @created: 2020/08/02 17:44
 */

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/quick9")
    @ResponseBody
    public User save9() {
        User user = new User();
        user.setAge(6);
        user.setUsername("HUAHUA");
        return user;
    }


    @RequestMapping("/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("username", new Date());
        return modelAndView;
    }


    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("controller save running......");
        return "success";
    }
}
