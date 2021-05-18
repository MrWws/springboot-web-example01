package com.king.springboot.dao;

import com.king.springboot.pojo.Visitor_Age;
import com.king.springboot.pojo.Visitor_Total;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-20-19:52
 * @description:
 * @function:
 */
@Repository
public interface Visitor_AgeMapper {
    public List<Visitor_Age> query();
}
