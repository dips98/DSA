package MultiThreading;

// Prerequisites
// 1.Opps 2.OS 3.Basic Java Lang

// Multi Tasking with diffrent application(Process) in OS called "Process-Based/Context Switching" Multi Tasking

// Within Application(Process) doing multi tasking in Os is called "Thread-Based/Multi-Threading" Multi Tasking

public class MultiThread {
    public static void main(String[] args) {
        // System.out.printl
        System.out.println("Before changing: ");
        String name = Thread.currentThread().getName();
        System.out.println("The name of main thread is " + name);
        System.out.println("Priority of this thread is " + Thread.currentThread().getPriority());

        System.out.println("after changing :");
        Thread.currentThread().setName("Dipesh");
        Thread.currentThread().setPriority(2);
        String name1 = Thread.currentThread().getName();
        System.out.println("The name of main thread is " + name1);
        System.out.println("Priority of this thread is " + Thread.currentThread().getPriority());
    }
}
