package com.king.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jjk
 * @time: 2021-04-20-19:50
 * @description:
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor_Age {
    private int id;
    private String age_group;
    private int numbers;
}
