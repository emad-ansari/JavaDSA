package oops.javathread;


class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");


        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");

        System.out.println("I am  runnable thread 1");
        System.out.println("I am  runnable thread 1");
    }

}
class MythreadRunnable2 implements Runnable{

    public void run(){
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");
        System.out.println("I am runnable thread 2");


    }
}

public class JavaRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MythreadRunnable2 bullet2 = new MythreadRunnable2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        
    }
    
}
