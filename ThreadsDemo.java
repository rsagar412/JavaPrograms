class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("I am a thread...");
            System.out.println("Thread is running...");
            i++;
        }
        
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("I am a thread2...");
            System.out.println("Thread2 is running...");
            i++;
        }
        
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();    

        t1.start();
        t2.start();
    }
}
