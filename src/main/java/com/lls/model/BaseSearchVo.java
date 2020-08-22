package com.lls.model;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class BaseSearchVo {
    protected String beginDate;
    protected String endDate;
    protected Integer page;
    protected Integer rows;

}
