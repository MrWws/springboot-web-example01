package com.king.springboot.service;

import com.king.springboot.dao.Visitor_AgeMapper;
import com.king.springboot.dao.Visitor_TotalMapper;
import com.king.springboot.pojo.Visitor_Age;
import com.king.springboot.pojo.Visitor_Total;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:06
 * @description:
 * @function:
 */
@Service
public class Visitor_AgeService {
    @Autowired
    Visitor_AgeMapper vam;

    public List<Visitor_Age> query(){
        return vam.query();
    }
}
