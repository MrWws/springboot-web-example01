package com.king.springboot.service;

import com.king.springboot.dao.Security_InfoMapper;
import com.king.springboot.dao.Visitor_TotalMapper;
import com.king.springboot.pojo.Security_Info;
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
public class Security_InfoService {
    @Autowired
    Security_InfoMapper trm;

    public List<Security_Info> query(){
        return trm.query();
    }
}
