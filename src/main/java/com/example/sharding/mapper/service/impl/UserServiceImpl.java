package com.example.sharding.mapper.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sharding.entity.User;
import com.example.sharding.mapper.UserMapper;
import com.example.sharding.mapper.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void insertUser(User user) {
        save(user);
    }
}
