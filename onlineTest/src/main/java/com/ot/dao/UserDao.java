package com.ot.dao;


import com.ot.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}