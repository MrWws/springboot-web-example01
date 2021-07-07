package com.king.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jjk
 * @time: 2021-04-20-20:45
 * @description: 该类可涵盖讲解服务类型、观众预约渠道统计以及全年观众接待量月排行
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Total_Bymonth {
    private int id;
    private int months;
    //讲解类型
    private int volunteer_explain;
    private int full_time_public;
    private int full_time_customized;
    private int wisdom_tour;
    //预约渠道
    private int wechat_count;
    private int web_count;
    private int other_count;
    //全年观众接待量月排行
    private int arrived_count;
}
