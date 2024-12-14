package com.oscar.web.service;

import com.oscar.dao.InterviewDAO;
import com.oscar.web.controller.in.ListInModel;
import com.oscar.web.controller.out.ListOutModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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


    public static void main(String[] args) {
        Integer num = 10;
        Integer[] arr = new Integer[num];

        //生成指定范围  ids.size 内10个不重复的随机数
        Integer size = 20;
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            while(true){
                int number = r.nextInt(size) + 1;
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == number){
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    arr[i] = number;
                    break;
                }
            }
        }

        List<Integer> ints = Arrays.asList(arr);
        System.out.println(ints);

    }

    public List<ListOutModel> list(ListInModel inModel) {
        String searchKey = inModel.getSearchKey();
        List<Integer> ids = interviewDAO.selectId(searchKey);
        Integer num = inModel.getPagesize();
        if (num > ids.size()){
            num = ids.size();
        }
        Integer[] arr = new Integer[num];

        //生成指定范围  ids.size 内10个不重复的随机数
        Integer size = ids.size();
        Random r = new Random();

        for (int i = 0; i < num; i++) {
            while(true){
                int number = r.nextInt(size) + 1;
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == number){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    arr[i] = number;
                    break;
                }
            }
        }
        List<Integer> checkIds = new ArrayList<>();
        //获取题目随机id，进行抽查
        for (Integer xiabiao : arr) {
            Integer checkId = ids.get(xiabiao-1);
            checkIds.add(checkId);
        }
        inModel.setIds(checkIds);
        List<ListOutModel> out = interviewDAO.list(inModel);

        //对这些已选过的checkId进行记录点击，后续筛选优先选未被点击过的
        interviewDAO.batchUpdateClick(checkIds);


        return out;
    }
}
