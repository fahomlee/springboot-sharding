package com.example.sharding.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.entity.User;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
