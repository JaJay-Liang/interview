package com.oscar.model;


import java.io.Serializable;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 面试题目表
* @TableName interview_test
*/
@Data
public class InterviewTest implements Serializable {

    /**
    * 主键id
    */
    @ApiModelProperty("主键id")
    private Integer id;
    /**
    * 类型
    */
    @ApiModelProperty("类型")
    private Integer kType;
    /**
    * 题目
    */
    @ApiModelProperty("题目")
    private String title;
    /**
    * 答案
    */
    @ApiModelProperty("答案")
    private String answer;
    /**
    * 例图
    */
    @ApiModelProperty("例图")
    private String pic;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date ctime;
    /**
    * 修改时间
    */
    @ApiModelProperty("修改时间")
    private Date mtime;


}
