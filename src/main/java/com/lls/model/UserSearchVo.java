package com.lls.model;

import lombok.Data;

@Data
public class UserSearchVo extends BaseSearchVo{
    private String name;
    private Integer age;

    public UserSearchVo(String name, Integer age,String beginDate,String endDate,Integer page,Integer rows) {
        this.name = name;
        this.age = age;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.page = page;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "UserSearchVo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
