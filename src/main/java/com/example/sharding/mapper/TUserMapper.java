package com.example.sharding.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.entity.TUser;


@Mapper
public interface TUserMapper extends BaseMapper<TUser> {
}
