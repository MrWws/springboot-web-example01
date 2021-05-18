package com.king.springboot.dao;

import com.king.springboot.pojo.cp.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.03.18
 */
@Repository
@Mapper
public interface CpDao {

    /**
     * 用户登录接口
     * @return 查询登录的用户
     */
    List<Cp> collectionQuery();
    List<CpNumber> collectionNumberQuery();
    List<CpType> collectionTypeQuery();
    List<CpDynasty> collectionDynastyQuery();
    List<CpRepair> collectionRepairQuery();
    List<CpStorage> collectionStorageQuery();
    List<CpBorrowing> collectionBorrowingQuery();

}
