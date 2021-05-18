package com.king.springboot.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jjk
 * @time: 2021-04-16-21:06
 * @description:
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor_Total {
    private int id;
    private int years;
    private int arrived_count;
    private int register_count;
    private int reserved_count;
}
