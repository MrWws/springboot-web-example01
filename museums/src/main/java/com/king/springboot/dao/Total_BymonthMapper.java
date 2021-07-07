package com.king.springboot.dao;

import com.king.springboot.pojo.Total_Bymonth;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:24
 * @description:
 * @function:
 */
@Repository
public interface Total_BymonthMapper {
    public List<Total_Bymonth> query();


}
