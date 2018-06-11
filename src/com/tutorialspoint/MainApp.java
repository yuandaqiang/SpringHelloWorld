package com.tutorialspoint;

import org.junit.Test;

public class MainApp {

    @Test
    public void main()
    {

    //    System.out.println("死锁测试结束");
      /*  Logger log = Logger.getLogger(MainApp.class.getName());
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");*/
        /*String a=new String("5");
        String b=new String("5");
        System.out.println("a i b") ;
        System.out.println(a.intern()==b);
        String c=new String("5");*/
        //System.out.println("12"=="12");
        //System.out.println("12".equals("12"));
    //    System.out.println("a==b:");
        //System.out.println(a==b);
      //  System.out.println("a==c:"+a==c);
     //   System.out.println("a e b:"+a.equals(b));
       //System.out.println("a e c:"+a.equals(c));
    /*    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplateNew studentJDBCTemplateNew=(StudentJDBCTemplateNew) context.getBean("StudentJDBCTemplateNew");
        System.out.println("---------------Record creation----------------");
        studentJDBCTemplateNew.create("yuandaqiang",17);
        studentJDBCTemplateNew.create("chenying",18);
        studentJDBCTemplateNew.create("luoyufang",18);
        System.out.println("---------------Listing Multiple Record---------------");
        List<StudentDB> studentDBS=studentJDBCTemplateNew.listStudents();
        for (StudentDB studentDB:studentDBS)
        {
            System.out.println("Name:"+studentDB.getName());
            System.out.println("Id:"+studentDB.getId());
            System.out.println("Age:"+studentDB.getAge());
        }
        System.out.println("---------------Update Record with id=2---------------");
        studentJDBCTemplateNew.update(2,19);
        System.out.println("---------------List Record with id=2---------------");
        StudentDB studentDB=studentJDBCTemplateNew.getStudentDB(2);
        System.out.println("Name:"+studentDB.getName());
        System.out.println("Id:"+studentDB.getId());
        System.out.println("Age:"+studentDB.getAge());*/
    /*    Map< String, String> map = new HashMap<String, String>();
        map.put("a", "a1");
        map.put("b", "b1");
        map.put("c", "c1");

//第一种方式：
        for (String key : map.keySet()) {
            System.out.println("key = " + key + " and value = "+ map.get(key));
        }

//第二种方式：
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
                    .next();
            System.out.println("key = " + entry.getKey() + " and value = "+ entry.getValue());
        }

//第三种方式：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
*/

       /* CStudent cStudent=(CStudent) context.getBean("cStudent");
        cStudent.getName();
       cStudent.getAge();*/
   // HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
    //   Logging logging=(Logging) context.getBean("logging");
      //  helloWorld.getMessage();
       // logging.print(2);
       // System.out.println("--------------");
      //  cStudent.printThrowException();



        //  CustomEventPublisher customEventPublisher=(CustomEventPublisher) context.getBean("CustomEventPublisher");
      //  customEventPublisher.publish();
     /*   TextEditor textEditor=(TextEditor)context.getBean("TextEditor");
        textEditor.checkSpellChecker();
        textEditor.getList();
        textEditor.getSet();
        textEditor.getMap();
        textEditor.getProperties();*/
    /*    context.start();
        System.out.println("-------------------------");
        HelloWorld helloWorld= (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        context.stop();
        context.registerShutdownHook();*/
       /* Profile profile=(Profile)context.getBean("Profile");
        profile.printAll();
        context.registerShutdownHook();*/





      /*  HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        System.out.println("I'm object A hashcode"+objA.hashCode());
        context.registerShutdownHook();*/
     /*   HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
        System.out.println("I'm object B hashcode"+objB.hashCode());
        context.registerShutdownHook();
       System.out.println("");*/
      /*  HelloChina cA = (HelloChina) context.getBean("helloChina");
       // cA.setMessage("I'm China A");
        cA.getMessage();
        cA.getMessageNew();
        cA.getMessageNew2();
        System.out.println("");
        HelloChina cB = (HelloChina) context.getBean("helloChina");
        cB.getMessage();
        cB.getMessageNew2();
        cB.getMessageNew();
        context.registerShutdownHook();*/


/*
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext
                ("C://Users/lenovo/00myStudy/intellijIDEA/Workspaces/newProject/SpringHelloWorld/src/Beans.xml");
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
        obj.setMessage("I see three!");
        obj.getMessage();*/
     /*   ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        InjectDao i1=(InjectDao)context.getBean("injectDAO");
        InjectDaoServiceImpl i2=(InjectDaoServiceImpl) context.getBean("injectService");
        System.out.println("injectDAO i1:"+i1);
        System.out.println("injectService i2:"+i2);
        System.out.println("injectService i2.getInjectDao:"+i2.getInjectDAO());
        System.out.println("injectService i2.getString:"+i2.getString());*/

    }
}
