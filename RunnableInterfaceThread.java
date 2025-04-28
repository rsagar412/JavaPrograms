class MyThread implements Runnable{
   public void run(){
    System.out.println("I am a thread...");
   }
}

class MyThread2 implements Runnable{
    public void run(){
     System.out.println("I am a thread2...");
    }
 }

public class RunnableInterfaceThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread t3 = new Thread(t2);
        t.start();
        t3.start();
        System.out.println(t.threadId());
        System.out.println(t3.threadId());
    }
}
