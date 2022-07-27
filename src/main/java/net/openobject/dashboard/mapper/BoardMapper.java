package net.openobject.dashboard.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.openobject.dashboard.dto.Board;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM boards WHERE id = #{id}")
    public Board getBoard(int id);

    @Select("SELECT * FROM boards")
    public Board getBoards();

    @Insert("INSERT INTO boards(name, description, manager_id) VALUES(#{name}, #{description}, #{manager_id})")
    public void createBoard(Board createData);

    @Update("UPDATE boards SET name=#{name}, description=#{description} WHERE id=#{id}")
    public boolean updateBoard(Board updateData);

    @Delete("DELETE FROM boards WHERE id = #{id}")
    public boolean deleteBoard(int id);
}
