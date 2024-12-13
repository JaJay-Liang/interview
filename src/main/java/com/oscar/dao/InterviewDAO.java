package com.oscar.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oscar.model.InterviewTest;
import com.oscar.web.controller.in.ListInModel;
import com.oscar.web.controller.out.ListOutModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InterviewDAO extends BaseMapper<InterviewTest> {

    @Select("SELECT COUNT(1) FROM db_oscar_practice.interview_test ")
    Integer select1();

    List<ListOutModel> list(@Param("inModel") ListInModel inModel);

    @Select("SELECT id FROM db_oscar_practice.interview_test ")
    List<Integer> selectId();

}
