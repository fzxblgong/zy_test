package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("/findUserById")
    public String findUserById(Integer idxx, Model model){
        User user = userService.findUserById(idxx);
        model.addAttribute("user",user);
        return "userInfo";
    };
}
