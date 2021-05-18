package com.king.springboot.pojo.cp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wws
 * @Date: 2021/5/17 18:37
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CpBorrowing {
    private int id;
    private String borrowing_date;
    private String name;
    private String borrowing_reason;
    private String planned_return_time;
}