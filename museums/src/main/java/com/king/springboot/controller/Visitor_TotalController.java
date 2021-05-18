package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Total_Bymonth;
import com.king.springboot.pojo.Visitor_Total;
import com.king.springboot.service.Total_BymonthService;
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
public class Visitor_TotalController {
    @Autowired
    Visitor_TotalService tgs;
    @Autowired
    Total_BymonthService vas;
//    @RequestMapping("/toMain")
//    public String toMain(){
//        return "main";
//    }

    @RequestMapping("/main")
    public String query(Model model){
        List<Visitor_Total> total = tgs.query();
        String s1 = JSON.toJSONString(total);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        List<Total_Bymonth> total1=vas.query();
        String s2 = JSON.toJSONString(total1);
        Model obj2 = model.addAttribute("arrived_count", s2);
        System.out.println(s2);
//      request.setAttribute("obj",tgs.query());
        return "main";
    }
}
