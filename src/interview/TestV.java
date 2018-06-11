package interview;
import org.junit.Test;

class DeadLock
{
    private String string1="1";
    private String string2="2";
    Thread thread1=new Thread(new Runnable() {      //创建线程1
        @Override
        public void run() {
            while (true) {
                synchronized (string1) {
                    System.out.println("Thread1:string1 be locked");
                    synchronized (string2) {
                        System.out.println("Thread1:string2 be locked");
                    }
                }
            }
        }
    });

    Thread thread2=new Thread(new Runnable() {        //创建线程1
        @Override
        public void run() {
            while (true) {
                synchronized (string2) {
                    System.out.println("Thread2:string2 be locked");
                    synchronized (string1) {
                        System.out.println("Thread2:string1 be locked");
                    }
                }
            }
        }
    });
}
class Interview{
    public String reverseString(String string)
    {
        if(string.length()<=1)
            return string;
        else
            return reverseString(string.substring(1,string.length()))+string.substring(0,1);
    }
    public static int reverseNumber(int number)
    {
       int reverse=0;
       while (number!=0)
       {
           reverse=(reverse*10)+number%10;
           number=number/10 ;
       }
       return reverse;
    }
    public static String binaryFormat(int number)
    {
        if(number==0)
            return "0";
        String s="";
        while (number!=0)
        {
            if(number%2==1)
                s="1"+s;
            else
                s="0"+s;
            number=number/2;
        }
        return s;
    }
}
public class TestV {
    @Test
    public void main()
    {

    }
}
