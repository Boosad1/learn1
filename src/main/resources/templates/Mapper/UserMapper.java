package com.example.demo.Mapper;

import com.example.demo.Model.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public class UserMapper {
    public void insert(User user);
}
