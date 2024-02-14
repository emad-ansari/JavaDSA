package oops.exam;

class SharedResource {
    // Synchronized method to print the table of a given number
    synchronized void printTable(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TableThread extends Thread {
    private SharedResource sharedResource;
    private int number;

    public TableThread(SharedResource sharedResource, int number) {
        this.sharedResource = sharedResource;
        this.number = number;
    }

    @Override
    public void run() {
        sharedResource.printTable(number);
    }
}

class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create three threads sharing the same resource
        TableThread thread1 = new TableThread(sharedResource, 3);
        TableThread thread2 = new TableThread(sharedResource, 5);
        TableThread thread3 = new TableThread(sharedResource, 7);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
