package net.openobject.dashboard.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.openobject.dashboard.dto.LoginDTO;
import net.openobject.dashboard.dto.RegistDTO;
import net.openobject.dashboard.dto.User;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> getUsers();

    @Select("SELECT id, user_id, name, level FROM users WHERE user_id=#{user_id} AND password=PASSWORD(#{password})")
    User getUser(LoginDTO loginData);

    @Select("SELECT * FROM users WHERE user_id=#{user_id}")
    User idCheck(String id);

    @Select("INSERT INTO users(user_id, password, name) VALUES(#{user_id},PASSWORD(#{password}),#{name})")
    User addUser(RegistDTO registData);
}
