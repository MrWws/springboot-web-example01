package com.king.springboot.service.cp;

import com.king.springboot.dao.CpDao;
import com.king.springboot.dao.Visitor_TotalMapper;
import com.king.springboot.pojo.Visitor_Total;
import com.king.springboot.pojo.cp.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: wws
 * @Date: 2021/5/15 18:01
 * @Description:
 */
public class CpService {
    @Autowired
    CpDao cpdao;

    List<Cp> collectionQuery(){
        return cpdao.collectionQuery();
    };
    List<CpNumber> collectionNumberQuery(){
        return cpdao.collectionNumberQuery();
    };
    List<CpType> collectionTypeQuery(){
        return cpdao.collectionTypeQuery();
    };
    List<CpDynasty> collectionDynastyQuery(){
        return collectionDynastyQuery();
    };
    List<CpRepair> collectionRepairQuery(){
        return cpdao.collectionRepairQuery();
    };
    List<CpStorage> collectionStorageQuery(){
        return cpdao.collectionStorageQuery();
    };
    List<CpBorrowing> collectionBorrowingQuery(){
        return cpdao.collectionBorrowingQuery();
    };
}