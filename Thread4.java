import java.lang.Thread;
public class Thread4{
    public static void main(String[] args){
        Thread t3=new Thread(() -> {
            System.out.println("Executing Thread t4...");
        });
        t3.start();
    }
}