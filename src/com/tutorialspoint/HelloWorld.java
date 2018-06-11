package com.tutorialspoint;

public class HelloWorld  /*implements InitializingBean,DisposableBean,ApplicationContextAware,BeanNameAware*/ {
    private String message;

    public String getMessage() {
        System.out.println("Your message is:"+message);
        return message;
    }

    public void setMessage(String message) {
       this.message = message;
    }
   /* public void init()
    {
        System.out.println("Bean is going to init!");
    }

HelloWorld()
{
  //  System.out.println("helloWorld constructor");
}
    @Override
    public void afterPropertiesSet() throws Exception {
      //  System.out.println("afterPropertiesSet");
    }



    public void destroy() throws Exception {
        System.out.println("disposable destroy");
    }
    public void myDestroy()
    {
        System.out.println("myDestroy!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       // ((HelloChina)applicationContext.getBean("helloChina")).getMessageNew();
     //   System.out.println("setApplicationContext");
    }

    @Override
    public void setBeanName(String name) {
        //System.out.println("setBeanName");
    }*/
}
