package com.oscar.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oscar.model.InterviewTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface InterviewDAO extends BaseMapper<InterviewTest> {

    @Select("SELECT COUNT(1) FROM db_oscar_practice.interview_test ")
    Integer select1();
}
