package com.lls.dao;

import com.lls.model.User;
import com.lls.model.UserSearchVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> searchUser(UserSearchVo userSearchVo);
}
