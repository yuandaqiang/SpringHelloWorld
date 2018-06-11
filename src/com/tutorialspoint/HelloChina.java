package com.tutorialspoint;

public class HelloChina {
    private String message;
    private String messageNew;
    private String messageNew2;

    public void getMessageNew() {
        System.out.println("Your messageNew is:"+messageNew);
    }

    public void setMessageNew(String messageNew) {
        this.messageNew = messageNew;
    }

    public void getMessageNew2() {
       // System.out.println("Your messageNew2 is:"+messageNew2);
    }

    public void setMessageNew2(String messageNew2) {
        this.messageNew2 = messageNew2;
    }


    public void getMessage() {
        System.out.println("Your message is:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init()
    {
        System.out.println("Bean is going to init!");
    }
    public void destroy()
    {
        System.out.println("Bean is going to destroy!");
    }
}
