package dao;

import bean.StudentDB;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void  setDataSource(DataSource dataSource);
    public void create(String name,Integer age);
    public StudentDB getStudentDB(int id);
    public List<StudentDB> listStudents();
    public void delete(Integer id);
    public void update(Integer id,Integer age);

}
