package com.king.springboot.controller;

import com.king.springboot.pojo.User;
import com.king.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: jjk
 * @time: 2021-04-15-9:11
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        User ruser = userService.login(userName, passWord);
        System.out.println(ruser);
        if (ruser == null) {
            model.addAttribute("msg", "用户名或密码错误,请重新登录！");
            return "index";
        } else {
            session.setAttribute("userName", userName);
            model.addAttribute("msg", user.getUserName() + "登录成功！");
            return "redirect:/visitor/main";
        }
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    @RequestMapping("/register")
    public String register(User user,Model model){
        int u1=userService.register(user);
        if(u1==0){
            System.out.println("注册失败");
            model.addAttribute("msg","注册成功！");
            return "register";
        }
        model.addAttribute("msg","注册成功！");
        return "redirect:/visitor/main";
    }

    @RequestMapping("/outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("userName");
        response.sendRedirect("/user/login");
    }

}
