package com.king.springboot.dao;

import com.king.springboot.pojo.zl.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZlDao {
    List<Zl> exhibitionQuery();
    List<ZlAudience> exhibitionAudienceQuery();
}
