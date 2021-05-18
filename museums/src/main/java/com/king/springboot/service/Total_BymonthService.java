package com.king.springboot.service;

import com.king.springboot.dao.Total_BymonthMapper;
import com.king.springboot.dao.Visitor_TotalMapper;
import com.king.springboot.pojo.Total_Bymonth;
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
public class Total_BymonthService {
    @Autowired
    Total_BymonthMapper trm;

    public List<Total_Bymonth> query(){
        return trm.query();
    }
}
