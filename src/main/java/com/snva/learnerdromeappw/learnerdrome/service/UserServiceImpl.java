package com.snva.learnerdromeappw.learnerdrome.service;

import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.Role;
import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.User;
import com.snva.learnerdromeappw.learnerdrome.repository.RoleRepository;
import com.snva.learnerdromeappw.learnerdrome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  IUserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getRole() {
        return roleRepository.findAll();
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }
}
