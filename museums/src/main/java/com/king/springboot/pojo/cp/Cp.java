package com.king.springboot.pojo.cp;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: wws
 * @Date: 2021/4/15 16:51
 * @Description:
 */

public class Cp {

    private int id;
    private String year;
    private int number;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public Cp(int id, String year, int number) {
        this.id = id;
        this.year = year;
        this.number = number;
    }
}