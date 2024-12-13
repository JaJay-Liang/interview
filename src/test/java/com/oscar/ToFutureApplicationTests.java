package com.oscar;

import com.oscar.web.controller.in.ListInModel;
import com.oscar.web.controller.out.ListOutModel;
import com.oscar.web.service.InterviewTestService;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootTest
@Slf4j
class ToFutureApplicationTests {

    @Autowired
    private InterviewTestService interviewTestService;


    @Test
    void contextLoads() {
        ListInModel inModel = new ListInModel();
        List<ListOutModel> outList = interviewTestService.list(inModel);
        System.out.println(outList);
    }

}
