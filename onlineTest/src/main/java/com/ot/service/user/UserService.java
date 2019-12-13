package com.ot.service.user;

import com.github.pagehelper.PageInfo;
import com.ot.model.User;
import com.ot.model.UserDomain;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

    User findUserByName(String username);
}
