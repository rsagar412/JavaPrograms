class myThread extends Thread {
    public void run() {
        int i = 0;
        while(i<10){
        System.out.println(Thread.currentThread().getName());
       i++;
    }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        System.out.println("Starting thread 1...");
        
        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t1.currentThread().getState());
        t2.start();
        System.out.println(t2.getState());
        try{
            t2.sleep(10000);;
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Starting thread 2...");
        

        
        
    }
}
