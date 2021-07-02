package com.example;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeachsystemApplicationTests {

    @Autowired
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
        System.out.println(studentMapper);
        List<Student> students = studentMapper.selectList(null);
        System.out.println(students.size());
    }

}
