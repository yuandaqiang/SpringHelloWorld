package bean;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<StudentDB> {
    public StudentDB mapRow(ResultSet resultSet,int rowNum) throws SQLException {
        StudentDB studentDB=new StudentDB();
        studentDB.setAge(resultSet.getInt("age"));
        studentDB.setId(resultSet.getInt("id"));
        studentDB.setName(resultSet.getString("name"));
        return studentDB;
    }


}
