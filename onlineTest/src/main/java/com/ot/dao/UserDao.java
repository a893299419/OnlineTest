package com.ot.dao;


import com.ot.model.User;
import com.ot.model.UserDomain;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {


    int insertUser(User record);



    List<UserDomain> selectUsers();

    User getUserByName(String username);

    User checkUser(User user);
}