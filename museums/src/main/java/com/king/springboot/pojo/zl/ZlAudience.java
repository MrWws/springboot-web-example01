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
public class ZlAudience {
    private int id;
    private String name;
    private int year_reception_number;
    private int daily_reception_number;
    private int daily_online_pageviews_number;
}