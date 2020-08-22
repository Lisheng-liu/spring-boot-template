package com.lls.service.inf;

import com.github.pagehelper.PageInfo;
import com.lls.model.User;
import com.lls.model.UserSearchVo;

public interface IUserService {
    PageInfo<User> search(UserSearchVo userSearchVo);
}
