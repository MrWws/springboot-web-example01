package com.king.springboot.controller;
import com.alibaba.fastjson.JSON;
import com.king.springboot.pojo.Security_People;
import com.king.springboot.pojo.Total_Bymonth;
import com.king.springboot.service.Security_PeopleService;
import com.king.springboot.service.Total_BymonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-21-14:52
 * @description:
 * @function:
 */
@Controller
@RequestMapping("/security")
public class Security_PeopleController {
    @Autowired
    Security_PeopleService vas;
    @RequestMapping("/people")
    public String query(Model model){
        List<Security_People> total1=vas.query();
        Model obj1 = model.addAttribute("security_people", total1);
        System.out.println(total1);
        //改成对应的页面
        return "security_people";
    }
    @RequestMapping("/toadd")
    public String add(){
        return "security_people_add";
    }
    @RequestMapping("/addpeople")
    public String add(Model model,Security_People people){
        vas.add(people);
        return "redirect:/security/people";
    }
    @RequestMapping("/todel")
    public String todel(){
        return "security_people_del";
    }
    @RequestMapping("/delpeople")
    public String del(Model model,int job_id){
        vas.deleteByJob_Id(job_id);
        return "redirect:/security/people";
    }
    @RequestMapping("/toupdate")
    public String toupdate(){
        return "security_people_update";
    }
    @RequestMapping("/updatepeople")
    public String del(Model model,Security_People people){
        vas.update(people);
        return "redirect:/security/people";
    }
}
