package oops.javathread;

class MyThread1 extends Thread{
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
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();    
    }
    
}
 