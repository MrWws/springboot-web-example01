package com.king.springboot.service;

import com.king.springboot.dao.Visitor_AgeMapper;
import com.king.springboot.dao.Visitor_SexMapper;
import com.king.springboot.pojo.Visitor_Age;
import com.king.springboot.pojo.Visitor_Sex;
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
public class Visitor_SexService {
    @Autowired
    Visitor_SexMapper vam;

    public List<Visitor_Sex> query(){
        return vam.query();
    }
}
