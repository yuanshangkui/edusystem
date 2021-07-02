package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: yuansk
 * @date: 2021/7/1 / 21:51
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student {

//    @TableId(value = "stu_id")
    private String stuId;
    private String name;
    private String sex;
    private int age;
//    @TableField(value = "card_id")
    private String cardId;
    private String phone;
    private String address;
}
