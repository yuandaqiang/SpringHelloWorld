package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Profile {

    private Student student;

    public Student getStudent() {
        return student;
    }
    @Resource(name = "student2")
    public void setStudent(Student student) {
        this.student = student;
    }

    public void printAll()
    {
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
    @PostConstruct
    public void myInit()
    {
        System.out.println("student  myInit()");
    }
    @PreDestroy
    public void myDestroy()
    {
        System.out.println("student myDestroy()");
    }
}
