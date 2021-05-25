package com.king.springboot.service.zl;

import com.king.springboot.dao.ZlDao;
import com.king.springboot.pojo.zl.Zl;
import com.king.springboot.pojo.zl.ZlAudience;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: wws
 * @Date: 2021/5/17 17:02
 * @Description:
 */
public class ZlService {
    @Autowired
    ZlDao zldao;

    List<Zl> exhibitionQuery(){
        return zldao.exhibitionQuery();
    }
    List<ZlAudience> exhibitionAudienceQuery(){
        return zldao.exhibitionAudienceQuery();
    };
}