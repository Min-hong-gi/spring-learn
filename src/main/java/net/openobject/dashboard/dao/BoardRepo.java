package net.openobject.dashboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.openobject.dashboard.dto.Board;

@Repository
public class BoardRepo {
    private static final String mapperBase = "net.openobject.dashboard.mapper.BoardMapper.";
    @Autowired
    private SqlSession sqlsession;

    public Board getBoard(int id) throws Exception {
        return sqlsession.selectOne(mapperBase + "getBoard", id);
    }

    public List<Board> getBoards() throws Exception {
        return sqlsession.selectList(mapperBase + "getBoards");
    }

    public int createBoard(Board createData) throws Exception {
        return sqlsession.insert(mapperBase + "createBoard", createData);
    }

    public int updateBoard(Board updateData) throws Exception {
        return sqlsession.update(mapperBase + "updateBoard", updateData);
    }

    public int deleteBoard(int id) throws Exception {
        return sqlsession.delete(mapperBase + "deleteBoard", id);
    }
}
