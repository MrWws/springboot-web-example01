package com.king.springboot.pojo;

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
public class Reserved_Time {
    private int id;
    private int day;
    //时间段
    private int eight;//8-11
    private int eleven;//11-14
    private int fourteen;//14-18
}
