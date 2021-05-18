package com.king.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jjk
 * @time: 2021-04-21-15:24
 * @description: 安防类
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security_Info {
    private int id;
    private int years;
    private int check_bags;
    private int check_cars;
    private int patrol_numbers;
    private int security_people;
}
