package com.king.springboot.pojo.cp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jjk
 * @time: 2021-04-20-21:46
 * @description: 游客每日三个时间段按月统计表
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CpRepair {
    private int id;
    private String type;
    private int number;
}
