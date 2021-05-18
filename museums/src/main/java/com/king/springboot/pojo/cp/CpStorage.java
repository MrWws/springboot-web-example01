package com.king.springboot.pojo.cp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wws
 * @Date: 2021/5/17 14:12
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CpStorage {
    private int id;
    private String name;
    private int number;
}