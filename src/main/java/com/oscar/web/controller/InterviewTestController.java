package com.oscar.web.controller;

import com.oscar.dao.InterviewDAO;
import com.oscar.model.JsonResult;
import com.oscar.web.controller.in.ListInModel;
import com.oscar.web.controller.out.ListOutModel;
import com.oscar.web.service.InterviewTestService;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("api/interview/")
public class InterviewTestController {

    @Autowired
    private InterviewTestService interviewTestService;


    @PostMapping("/list")
    @ApiModelProperty("获取题目列表")
    public JsonResult<List<ListOutModel>> list(@RequestBody ListInModel inModel){
        List<ListOutModel> outList = interviewTestService.list(inModel);
        return JsonResult.success("获取成功",outList);
    }

}
