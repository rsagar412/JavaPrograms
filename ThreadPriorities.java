class myThread extends Thread {
    public void run() {
            System.out.println(Thread.currentThread().getName() + " - ");
        }
    
    public myThread(String name) {
        setName(name);
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        //Ready queue : Thread 1, Thread 2, Thread 3, Thread 4, Thread 5 - JVM is responsible for scheduling the threads.
        myThread t1 = new myThread("Thread 1");
        myThread t2 = new myThread("Thread 2");
        myThread t3 = new myThread("Thread 3");
        myThread t4 = new myThread("Thread 4");
        myThread t5 = new myThread("Thread 5 (Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        // t3.setPriority(Thread.MIN_PRIORITY);
        // t4.setPriority(Thread.MAX_PRIORITY);
        // t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
