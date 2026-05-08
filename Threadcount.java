import java.lang.Thread;
class Counter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class Threadcount{
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread t1=new Thread(() -> {
            System.out.println("System Thread 1 is created...");
            for(int i=0; i<1000; i++)counter.increment();
        });
        Thread t2 = new Thread(() -> {
            System.out.println("System Thread 2 is created... ");
            for (int j=0; j<1000; j++)counter.increment();
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("Final incrementation : %d",counter.getCount());
    }
}