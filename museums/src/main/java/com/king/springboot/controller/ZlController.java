package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.dao.ZlDao;
import com.king.springboot.pojo.cp.CpType;
import com.king.springboot.pojo.zl.Zl;
import com.sun.xml.internal.stream.StaxErrorReporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: wws
 * @Date: 2021/5/17 17:05
 * @Description:
 */
@Controller
@RequestMapping("/zl")
public class ZlController {
    @Autowired
    ZlDao zldao;

    @RequestMapping("/overview")
    public String query(Model model){
        List<Zl> zl = zldao.exhibitionQuery();
        String s1 = JSON.toJSONString(zl);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        return "exhibition_overview";
    }
}