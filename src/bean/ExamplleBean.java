package bean;

import org.springframework.beans.factory.InitializingBean;

public class ExamplleBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method");
    }
}
