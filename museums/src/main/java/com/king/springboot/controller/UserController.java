package com.king.springboot.controller;

import com.king.springboot.pojo.User;
import com.king.springboot.service.UserService;
import com.king.springboot.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author: jjk
 * @time: 2021-04-14-23:20
 * @description:
 * @function:
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/sel")
////    public String Sel(User user, Model model){
////        User loginUser=userService.Sel(user);
////        model.addAttribute("msg",loginUser);
////        return "main";
////    }
    //验证码
    @GetMapping("/check/code")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {

        BufferedImage image = ValidateImageCodeUtils.createImage();
        session.setAttribute("checkCode",image);
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"jpg",os);
    }
}
