package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Mapper
public interface UserDao {

    List<User> selectAllUsers();

    User selectById(int id);

    int addUser(User user);

    int updateUser(User user);

    int removeUser(User user);


}
