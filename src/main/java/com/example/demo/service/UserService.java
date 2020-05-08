package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addPerson(User user) {
        return userDao.addUser(user);
    }

    public User selectUserById(int id) {
        return userDao.selectById(id);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int removeUser(User user) {
        return userDao.removeUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }
}
