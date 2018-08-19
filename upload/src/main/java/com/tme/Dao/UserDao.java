package com.tme.Dao;

import com.tme.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface UserDao {

    @Select("SELECT * FROM t_user WHERE username = #{username} AND password = #{password};")
    User login(@Param("username") String username, @Param("password") String password);


}
