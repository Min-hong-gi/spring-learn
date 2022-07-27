package net.openobject.dashboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.openobject.dashboard.dto.LoginDTO;
import net.openobject.dashboard.dto.RegistDTO;
import net.openobject.dashboard.dto.User;


@Repository
public class UserRepo {
    private static final String mapperBase = "net.openobject.dashboard.mapper.UserMapper.";
    @Autowired
    private SqlSession sqlsession;

    public List<User> getUsers() throws Exception {
        return this.sqlsession.selectList(mapperBase + "getUsers");
    }

    public User getUser(LoginDTO loginData) throws Exception {
        return this.sqlsession.selectOne(mapperBase+"getUser", loginData);
    }

    public User idCheck(String id) throws Exception {
        return this.sqlsession.selectOne(mapperBase+"idCheck", id);
    }

    public User addUser(RegistDTO loginData) throws Exception {
        return this.sqlsession.selectOne(mapperBase+"addUser", loginData);
    }
}
