import java.lang.Thread;
class MyThread extends Thread{
    public void run(){
        System.out.println("System Thread is running ...");
    }
}
public class Thread2{
    public static void main(String[] args){
        MyThread t1=new MyThread();
        t1.start();
    }
}
