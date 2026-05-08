//Implementing Thread using extend keyword
class MyThread extends Thread{
    public void run(){
        System.out.println("The Thread executing is : ",this.getName());
    }
}
MyThread t1=new MyThread();
t1.start();
//Implementing Thread using Implements
class MyRunnable implements Runnable{
    public void run(){
        System.out.prinln("MyRunnable is executing...");
    }
}
Thread t2=new Thread(new MyRunnable());
t2.start();
//Implementing using Lambda Syntax from Java 8+
Thread t3= new Thread{() -> {
    System.out.println("Lambda Thread executing...");
}};
t3.start();