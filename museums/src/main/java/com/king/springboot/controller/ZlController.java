package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.king.springboot.dao.CpDao;
import com.king.springboot.dao.ZlDao;
import com.king.springboot.pojo.cp.CpType;
import com.king.springboot.pojo.zl.Zl;
import com.king.springboot.pojo.zl.ZlAudience;
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
    ZlDao zlDao;

    @Autowired
    CpDao cpDao;

    @RequestMapping("/overview")
    public String query(Model model){
        List<Zl> zl = zlDao.exhibitionQuery();
        String s1 = JSON.toJSONString(zl);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);

        List<ZlAudience> zlaudience = zlDao.exhibitionAudienceQuery();
        String s2 = JSON.toJSONString(zlaudience);
        Model obj2 = model.addAttribute("obj1", s2);
        System.out.println(s2);

        List<CpType> cpType = cpDao.collectionTypeQuery();
        String s3 = JSON.toJSONString(cpType);
        Model obj3 = model.addAttribute("obj2", s3);
        System.out.println(s3);


        return "exhibition_overview";


    }

}