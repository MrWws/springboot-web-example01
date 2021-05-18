package com.king.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author: jjk
 * @time: 2021-04-21-16:10
 * @description:
 * @function:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security_People {
    private int id;
    private int job_id;
    private String name;
    private String sex;
    private Date birth;
    private String position;
    private int age;
    private long phone_numbers;

}
