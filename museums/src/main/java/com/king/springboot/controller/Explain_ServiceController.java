package com.king.springboot.controller;
import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Reserved_Time;
import com.king.springboot.pojo.Total_Bymonth;
import com.king.springboot.service.Total_BymonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-21-14:52
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/visitor")
public class Explain_ServiceController {
    @Autowired
    Total_BymonthService vas;

    @RequestMapping("/explain")
    public String query(Model model){

        List<Total_Bymonth> total1=vas.query();
        String s1 = JSON.toJSONString(total1);
        Model obj1 = model.addAttribute("explain_service", s1);
        System.out.println(s1);
        //改成对应的页面
        return "explain_service";
    }
}
