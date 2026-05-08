import java.lang.Thread;
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("System Thread 3 is running ...");
    }
}
public class Thread3{
    public static void main(String[] args){
        Thread t3= new Thread(new MyRunnable());
        t3.start();
    }
}