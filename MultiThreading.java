/*  Thread - A "lightweight" sub-process; the smallest unit of execution.
    Multithreading is a process in which multiple parts of a program (threads)
    execute simultaneously */

// using thread class
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}
// runnable interface
class MyThread1 implements Runnable {

    public void run() {
        System.out.println("Thread running");
    }
}

// multiple threads
class A extends Thread {

    public void run() {
        System.out.println("Thread A");
    }

}

class B extends Thread {

    public void run() {
        System.out.println("Thread B");
    }

}
public class MultiThreading {
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();   // thread start
        MyThread1 obj = new MyThread1();
        Thread t1 = new Thread(obj);
        t1.start();
        A t2 = new A();
        B t3 = new B();

        t2.start();
        t3.start();
    }
    
}
