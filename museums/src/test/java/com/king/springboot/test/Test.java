package com.king.springboot.test;

import com.king.springboot.pojo.Visitor_Total;
import com.king.springboot.service.Visitor_TotalService;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-22:14
 * @description:
 * @function:
 */
public class Test {
   

    public static void main(String[] args) {
        
        Visitor_TotalService tgs=new Visitor_TotalService();
        List<Visitor_Total> query = tgs.query();
        System.out.println(query);
    }
}
