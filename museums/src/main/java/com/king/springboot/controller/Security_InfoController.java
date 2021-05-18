package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Security_Info;
import com.king.springboot.pojo.Total_Bymonth;
import com.king.springboot.pojo.Visitor_Total;
import com.king.springboot.service.Security_InfoService;
import com.king.springboot.service.Visitor_TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-21-15:31
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/security")
public class Security_InfoController {
    @Autowired
    Security_InfoService tgs;

    @RequestMapping("/main")
    public String query(Model model){
        List<Security_Info> total = tgs.query();
        String s1 = JSON.toJSONString(total);
        Model obj1 = model.addAttribute("security", s1);
        System.out.println(s1);

//      request.setAttribute("obj",tgs.query());
        return "security";
    }
    //空调界面
    @RequestMapping("/air_conditioner")
    public String toAir_Conditioner(){
        return "air_conditioner";
    }

}
