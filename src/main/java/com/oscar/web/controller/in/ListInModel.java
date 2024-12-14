package com.oscar.web.controller.in;


import lombok.Data;

import java.util.List;

@Data
public class ListInModel {

    private List<Integer> ids;

    private Integer pagesize = 10;

    private String searchKey;
}
