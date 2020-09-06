package com.lls.controller;

import com.github.pagehelper.PageInfo;
import com.lls.aspect.BusinessType;
import com.lls.aspect.Log;
import com.lls.config.aspect.ReturnMsg;
import com.lls.model.User;
import com.lls.model.UserSearchVo;
import com.lls.service.inf.IUserService;
import com.lls.util.ControllerUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(tags = "用户管理")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    @ApiOperation(value = "addUser",notes = "addUser")
    @Log(title = "addUser",buinessType = BusinessType.INSERT)
    public ReturnMsg insertUser(@ApiParam(name = "user",value="user") @RequestBody User user){
        log.info("addUser",user);
        ControllerUtil.requireNotEmpty(user.getName(),"name cannot be null");
        user.setId(ControllerUtil.generate32Byte());
        //TODO ---
        return ReturnMsg.createSuccess();
    }
    @PutMapping
    @ApiOperation(value = "updateUser",notes = "updateUser")
    public ReturnMsg updateUser(@ApiParam(name = "user",value="user") @RequestBody User user){
        log.info("updateUser",user);
        ControllerUtil.requireNotEmpty(user.getId(),"id cannot be null");
        ControllerUtil.requireNotEmpty(user.getName(),"name cannot be null");

        //TODO ---
        return ReturnMsg.createSuccess();
    }

    @DeleteMapping
    @ApiOperation(value = "delUser",notes = "delUser")
    public ReturnMsg delUser(@ApiParam(name = "id",value="id") @RequestParam(value = "id",required = false)String id){
        log.info("delUser",id);
        ControllerUtil.requireNotEmpty(id,"id cannot be null");

        //TODO ---
        return ReturnMsg.createSuccess();
    }

    @GetMapping
    @ApiOperation(value = "searchUser",notes = "searchUser")
    @Log(title = "addUser",buinessType = BusinessType.SELECT)
    public ReturnMsg searchUser(
            @ApiParam(name = "name",value="name") @RequestParam(value = "name",required = false)String name,
            @ApiParam(name = "age",value="age") @RequestParam(value = "age",required = false)Integer age,
            @ApiParam(name = "beginDate",value="beginDate") @RequestParam(value = "beginDate",required = false)String beginDate,
            @ApiParam(name = "endDate",value="endDate") @RequestParam(value = "endDate",required = false)String endDate,
            @ApiParam(name = "page",value="page") @RequestParam(value = "page",required = false)Integer page,
            @ApiParam(name = "rows",value="rows") @RequestParam(value = "rows",required = false)Integer rows){

        UserSearchVo userSearchVo = new UserSearchVo(name,age,beginDate,endDate,page,rows);
        log.info("searchUser",userSearchVo);
//        PageInfo<User> pageInfo = userService.search(userSearchVo);
        PageInfo<User> pageInfo = null;
        //TODO ---
        return ReturnMsg.createSuccess().data(pageInfo);
    }

}
