package com.snva.learnerdromeappw.learnerdrome.service;

import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.Role;
import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.User;

import java.util.List;

public interface IUserService {

    List<Role> getRole();
    List<User> getUsers();
    User getUser(String email);
    User createUser(User user);

}
