package com.king.springboot.pojo.cp;

/**
 * @Auther: wws
 * @Date: 2021/4/17 20:46
 * @Description:
 */
public class CpNumber {

    private int id;
    private String name;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CpNumber(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
