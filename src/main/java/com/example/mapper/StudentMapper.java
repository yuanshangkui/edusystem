package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: yuansk
 * @date: 2021/7/1 / 21:50
 * @description:
 */

@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {


}
