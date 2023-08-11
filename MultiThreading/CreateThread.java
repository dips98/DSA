package MultiThreading;

//  Two ways to create the Threads in java
// 1. By extending the Thread class 2. By implementing runable Interface


//  Boss of all thread is Thread Schedular

class Mythread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}


public class CreateThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Mythread t = new Mythread();
        t.start();
    }
}
