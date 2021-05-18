package com.king.springboot.pojo.zl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wws
 * @Date: 2021/5/17 16:51
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zl {
    private int id;
    private String name;
    private int number_year;
    private int number_current;
}