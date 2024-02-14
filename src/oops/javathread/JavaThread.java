package oops.javathread;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 10000){
            System.out.println("Thread 1 is running");
            i++;
        }
        System.out.println("Exit from thread 1");

    }


}
class MyThread2 extends Thread{
    public void run() {
        int j  = 0;
        while (j < 10000){
            System.out.println("Thread 2 is running");
            j++;
        }
        System.out.println("Exit from thread 2");
    }

}

public class JavaThread {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            MyThread1 t1 = new MyThread1();
            MyThread2 t2 = new MyThread2();

            t1.start();
            t2.start();    
            t2.setPriority(6);
            Thread.sleep(2000);    
            System.out.println("Sleep time in millisecond: " + (System.currentTimeMillis() - start));

        }
        catch(Exception e){
            System.out.println(e);
        }
 
    }
    
}
 


class ThreadSleep extends Thread{
    int sleepTime;
    ThreadSleep(String threadName, int sleepTime) {
        super(threadName);
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is starting....");
        try {
            Thread.sleep(sleepTime);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(this.getName() + " has completed after sleeping for " + sleepTime + " millisecond");
    }
}

class sleepExample{
    public static void main(String[] args) {
        ThreadSleep thread1 = new ThreadSleep("Thread 1", 1000);
        ThreadSleep thread2 = new ThreadSleep("thread 2", 2000);
        thread1.start();
        thread2.start();
    }
    


} 