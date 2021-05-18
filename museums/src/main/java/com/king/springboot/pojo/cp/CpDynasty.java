package com.king.springboot.pojo.cp;

/**
 * @Auther: wws
 * @Date: 2021/4/27 10:14
 * @Description:
 */
public class CpDynasty {
    private int id;
    private String dynasty;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CpDynasty(int id, String dynasty, int number) {
        this.id = id;
        this.dynasty = dynasty;
        this.number = number;
    }
}