package com.king.springboot.dao;

import com.king.springboot.pojo.Visitor_Total;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:24
 * @description:
 * @function:
 */
@Repository
public interface Visitor_TotalMapper {
    public List<Visitor_Total> query();


}
