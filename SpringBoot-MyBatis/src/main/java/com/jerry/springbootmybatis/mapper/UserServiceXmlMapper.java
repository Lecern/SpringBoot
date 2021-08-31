package com.jerry.springbootmybatis.mapper;

import com.jerry.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface UserServiceXmlMapper {

    List<User> findAll();

}
