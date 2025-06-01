package com.oscar.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class OomConfig implements InitializingBean, DisposableBean {



    @Override
    public void destroy() throws Exception {
        log.info("执行bean destory");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("执行oom开始test");
        List<OomConfig> list = new ArrayList<>();

    }
}
