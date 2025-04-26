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
        log.info("执行beandestory");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("执行oom开始test");
        List<OomConfig> list = new ArrayList<>();
        while (true){
            OomConfig oomConfig = new OomConfig();
            log.info("add");
            list.add(oomConfig);
        }

    }
}
