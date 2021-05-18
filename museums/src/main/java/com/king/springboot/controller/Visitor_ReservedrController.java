package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Reserved_Time;
import com.king.springboot.pojo.Total_Bymonth;
import com.king.springboot.service.Reserved_TimeService;
import com.king.springboot.service.Total_BymonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:45
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/visitor")
public class Visitor_ReservedrController {
    @Autowired
    Total_BymonthService vas;
    @Autowired
    Reserved_TimeService tgs;

    @RequestMapping("/reserved")
    public String query(Model model){

        List<Total_Bymonth> total1=vas.query();
        String s1 = JSON.toJSONString(total1);
        Model obj1 = model.addAttribute("reserved_channels", s1);
        System.out.println(s1);
//      request.setAttribute("obj",tgs.query());
        List<Reserved_Time> total2=tgs.query();
        String s2 = JSON.toJSONString(total2);
        Model obj2 = model.addAttribute("reserved_time", s2);
        System.out.println(s2);
        //改成对应的页面
        return "visitor_reserved";
    }
}
