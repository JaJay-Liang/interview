package com.oscar.web.controller;

import com.oscar.config.OomConfig;
import com.oscar.dao.InterviewDAO;
import com.oscar.model.JsonResult;
import com.oscar.web.controller.in.ListInModel;
import com.oscar.web.controller.out.ListOutModel;
import com.oscar.web.service.InterviewTestService;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
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

    @PostMapping("/oom")
    @ApiModelProperty("oom")
    public JsonResult<List> oom(@RequestBody ListInModel inModel){
//        List<ListOutModel> outList = interviewTestService.list(inModel);
        List<OomConfig> outList = new ArrayList<>();
        int i = 1;
        while (i == 1){
            OomConfig oomConfig = new OomConfig();
            log.info("add");
            outList.add(oomConfig);
        }

        return JsonResult.success("获取成功",outList);
    }

}
