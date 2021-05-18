package com.king.springboot.dao;

import com.king.springboot.pojo.Security_Info;
import com.king.springboot.pojo.Total_Bymonth;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-21-15:27
 * @description:
 * @function:
 */

@Repository
public interface Security_InfoMapper {
    public List<Security_Info> query();
}
