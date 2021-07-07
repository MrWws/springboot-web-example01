package com.king.springboot.dao;

import com.king.springboot.pojo.Security_People;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-16-21:24
 * @description:
 * @function:
 */
@Repository
public interface Security_PeopleMapper {
    public List<Security_People> query();
    public int add(Security_People people);
    public int deleteByJob_Id(int job_id);
    public int update(Security_People newpeople);

}
