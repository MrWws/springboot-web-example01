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
    private int nine;//9-10:4500人
    private int ten;//10-13:30：5000人
    private int thirteen;//13:30-15:30：5500人
}
