package com.king.springboot.dao;

import com.king.springboot.pojo.Visitor_Sex;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-20-19:52
 * @description:
 * @function:
 */
@Repository
public interface Visitor_SexMapper {
    public List<Visitor_Sex> query();
}
