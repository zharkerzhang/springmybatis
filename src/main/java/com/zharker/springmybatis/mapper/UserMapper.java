package com.zharker.springmybatis.mapper;

import com.zharker.springmybatis.entity.User;
import org.springframework.stereotype.Component;

@Component("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}