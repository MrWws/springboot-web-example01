package com.king.springboot.dao;

import com.king.springboot.pojo.Reserved_Time;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:24
 * @description:
 * @function:
 */
@Repository
public interface Reserved_TimeMapper {
    public List<Reserved_Time> query();
}
