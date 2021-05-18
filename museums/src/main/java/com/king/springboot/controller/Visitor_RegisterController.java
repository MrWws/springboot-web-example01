package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Visitor_Age;
import com.king.springboot.pojo.Visitor_Sex;
import com.king.springboot.pojo.Visitor_Total;
import com.king.springboot.service.Visitor_AgeService;
import com.king.springboot.service.Visitor_SexService;
import com.king.springboot.service.Visitor_TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:45
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/visitor")
public class Visitor_RegisterController {
    @Autowired
    Visitor_AgeService vas;
    @Autowired
    Visitor_SexService vss;

    @RequestMapping("/register")
    public String query(Model model){
//        List<Visitor_Total> total = vas.query();
        List<Visitor_Age> total1=vas.query();
        String s1 = JSON.toJSONString(total1);
        Model obj1 = model.addAttribute("age", s1);
        System.out.println(s1);
        List<Visitor_Sex> total2=vss.query();
        String s2 = JSON.toJSONString(total2);
        Model obj2 = model.addAttribute("sex", s2);
        System.out.println(s2);
//      request.setAttribute("obj",tgs.query());
        //改成对应的页面
        return "visitor_register";
    }
}
