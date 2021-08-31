package com.jerry.springbootmybatis.mapper;

import com.jerry.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserServiceMapper {

    @Select("select * from demo_01.t_user")
    List<User> findAllUser();

}
