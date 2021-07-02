package com.example;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: yuansk
 * @date: 2021/7/1 / 21:56
 * @description:
 */
@SpringBootTest
public class TestDatabase {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void f() {
        List<Student> students = studentMapper.selectList(null);
        System.out.println(students.size());
    }

}
