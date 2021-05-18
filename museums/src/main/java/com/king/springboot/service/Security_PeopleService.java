package com.king.springboot.service;

import com.king.springboot.dao.Security_PeopleMapper;
import com.king.springboot.dao.Visitor_TotalMapper;
import com.king.springboot.pojo.Security_People;
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
public class Security_PeopleService {
    @Autowired
    Security_PeopleMapper trm;

    public List<Security_People> query(){
        return trm.query();
    }
    public int add(Security_People people){return trm.add(people);}
    public int deleteByJob_Id(int job_id){return trm.deleteByJob_Id(job_id);}
    public int update(Security_People people){return trm.update(people);}
}
