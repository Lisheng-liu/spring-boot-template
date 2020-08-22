package com.lls.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    protected String createByName;
    protected Date createOn;
    protected String updateByName;
    protected Date updateOn;
}
