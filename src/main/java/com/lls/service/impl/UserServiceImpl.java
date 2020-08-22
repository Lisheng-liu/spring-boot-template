package com.lls.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lls.dao.UserMapper;
import com.lls.model.User;
import com.lls.model.UserSearchVo;
import com.lls.service.inf.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
//    @Autowired
//    private UserMapper userMapper;

    @Override
    public PageInfo<User> search(UserSearchVo userSearchVo) {
        PageInfo<User> pageInfo = PageHelper.startPage(userSearchVo.getPage(),userSearchVo.getRows()).doSelectPageInfo(()->{
            searchUser(userSearchVo);
        });

        return pageInfo;
    }

    private List<User> searchUser(UserSearchVo userSearchVo){
//        return  userMapper.searchUser(userSearchVo);
        return new LinkedList<>();
    }
}
