package com.king.springboot.controller;

import com.alibaba.fastjson.JSON;

import com.king.springboot.dao.CpDao;
import com.king.springboot.pojo.cp.*;

//import com.nwu.service.CpNumberService;
//import com.nwu.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: wws
 * @Date: 2021/4/15 16:21
 * @Description:
 */

@Controller
@RequestMapping("/cp")
public class CpController {

    @Autowired
    CpDao cpDao;

//    @RequestMapping("/main")
//    public String query(Model model){
//        List<Visitor_Total> total = tgs.query();
//        String s1 = JSON.toJSONString(total);
//        Model obj1 = model.addAttribute("obj", s1);
//        System.out.println(s1);
//        List<Total_Bymonth> total1=vas.query();
//        String s2 = JSON.toJSONString(total1);
//        Model obj2 = model.addAttribute("arrived_count", s2);
//        System.out.println(s2);
////      request.setAttribute("obj",tgs.query());
//        return "main";
//    }
    @RequestMapping("/detailTotalNumber")
    public String query(Model model){
        List<Cp> cp = cpDao.collectionQuery();
        String s1 = JSON.toJSONString(cp);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        List<CpNumber> cpNumber = cpDao.collectionNumberQuery();
        String s2 = JSON.toJSONString(cpNumber);
        Model obj2 = model.addAttribute("obj2", s2);
        System.out.println(s2);
        return "collection_overview";
    }

    @RequestMapping("/detailType")
    public String query2(Model model) {
        List<CpType> cpType = cpDao.collectionTypeQuery();
        String s1 = JSON.toJSONString(cpType);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        List<CpDynasty> cpDynasty = cpDao.collectionDynastyQuery();
        String s2 = JSON.toJSONString(cpDynasty);
        Model obj2 = model.addAttribute("obj2", s2);
        System.out.println(s2);
        return "collection_solicitation";
    }

    @RequestMapping("/detailRepair")
    public String query3(Model model) {
        List<CpRepair> cpRepair = cpDao.collectionRepairQuery();
        String s1 = JSON.toJSONString(cpRepair);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        return "collection_repair";
    }

    @RequestMapping("/detailStorage")
    public String query4(Model model) {
        List<CpStorage> cpStorage = cpDao.collectionStorageQuery();
        String s1 = JSON.toJSONString(cpStorage);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        return "collection_storage";
    }

    @RequestMapping("/detailBorrowing")
    public String query5(Model model) {
        List<CpBorrowing> cpBorrowing = cpDao.collectionBorrowingQuery();
        String s1 = JSON.toJSONString(cpBorrowing);
        Model obj1 = model.addAttribute("obj", s1);
        System.out.println(s1);
        return "collection_borrowing";
    }
}