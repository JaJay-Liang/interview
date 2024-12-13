package com.oscar.web.controller;

import com.oscar.dao.InterviewDAO;
import com.oscar.web.service.InterviewTestService;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("api/interview/")
public class InterviewTestController {

    @Autowired
    private InterviewTestService interviewTestService;


    @RequestMapping("/test")
    @ApiModelProperty("获取题目列表")
    public void test(){
        interviewTestService.test();

    }

}
