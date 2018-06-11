package dao;

import bean.StudentDB;
import bean.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    @Override
    public void setDataSource(DataSource dataSource) {
      this.dataSource=dataSource;
      this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
   String sql="insert into StudentDB(name,age) values(?,?)";
   jdbcTemplateObject.update(sql,name,age);
        System.out.println("create Record Name="+name+"Age"+age);
        return;
    }

    @Override
    public StudentDB getStudentDB(int id) {
       String sql="select * from StudentDB where id=?";
       StudentDB studentDB=jdbcTemplateObject.queryForObject(sql,new Object[]{id},new StudentMapper());
       return studentDB;
    }

    @Override
    public List<StudentDB> listStudents() {
        String sql="select * from StudentDB";
        List<StudentDB> studentDBS=jdbcTemplateObject.query(sql,new StudentMapper());
        return studentDBS;
    }

    @Override
    public void delete(Integer id) {
        String sql="delete from StudentDB where id=?";
        jdbcTemplateObject.update(sql,id);
        System.out.println("Delete Record with iD="+id);
        return;

    }

    @Override
    public void update(Integer id, Integer age) {
        String sql="update StudentDB set age=? where id=?";
        jdbcTemplateObject.update(sql,age,id);
        System.out.println("Update Record with ID="+id);
        return;

    }
}
