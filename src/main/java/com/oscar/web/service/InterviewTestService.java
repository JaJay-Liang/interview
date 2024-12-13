package com.oscar.web.service;

import com.oscar.dao.InterviewDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InterviewTestService {

    @Autowired
    private InterviewDAO interviewDAO;

    public void test() {
        log.info("进入");
        Integer count = interviewDAO.select1();
        log.info("结束：{}",count);
    }
}
