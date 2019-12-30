package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.User;
import com.cn.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public IUserService userService;
    @RequestMapping("/findUserById")
    public String findUserById(Integer idxx, Model model){
        User user = userService.getUserById(idxx);
        model.addAttribute("user",user);
        return "userInfo";
    };
}
