package com.lls.model;

import lombok.Data;

@Data
public class User extends BaseModel {
    private String id;
    private String name;
    private String age;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", createByName='" + createByName + '\'' +
                ", createOn=" + createOn +
                ", updateByName='" + updateByName + '\'' +
                ", updateOn=" + updateOn +
                '}';
    }
}
