package oops.exam;


import java.util.Random;

/*
 * 
 * Create three threads and perform following tasks:
   First thread generates random integer at every 1 second and if the value is even, second
   thread computes the square of the number and prints. If the value is odd, the third thread
   will print the value of cube of the number.
 */


public class Question_28 {
    public static void main(String[] args) {
        Thread1 thread  = new Thread1();
        thread.start();     
    }
    
}



class Thread1 extends Thread{
    // generate random integer at every second
    Random random = new Random();
    public void run() {
        // here  generate a random number every second
        int count = 0;

        while (true) {
            if (count == 10){
                break;
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
                int randomNumber = random.nextInt(100); // Generate a random integer (adjust the range as needed)

                System.out.println("Generated Random Number: " + randomNumber);

                if (randomNumber % 2 == 0) {
                    // If the number is even, create and start the SquareThread
                    new SquareThread(randomNumber).start();
                } else {
                    // If the number is odd, create and start the CubeThread
                    new CubeThread(randomNumber).start();
                }
                System.out.println("count is : " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }

    }

 
}

class SquareThread extends Thread{
    int randomNumber;
    SquareThread(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    // if integer random number is even then compute the square of this number and print it
    public void run() {
        randomNumber = randomNumber * randomNumber;
        System.out.println("Square of number is : " + randomNumber);
    }
}

class CubeThread extends Thread{
    // if number is odd compute the qube of this number and print it 
    int randomNumber;
    CubeThread(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void run() {
        randomNumber = randomNumber * randomNumber * randomNumber;
        System.out.println("Qube of odd random number is : " +  randomNumber);
    }

}