package com.king.springboot.pojo.cp;

/**
 * @Auther: wws
 * @Date: 2021/4/26 14:40
 * @Description:
 */
public class CpType {
    private int id;
    private String type;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CpType(int id, String type, int number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }
}