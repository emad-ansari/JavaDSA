package practice.exam;

class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front, rear; 


    public CustomQueue(){
        front = rear = 0;
        this.data = new int[DEFAULT_SIZE];
    }   
    public boolean insert(int item) throws QueueOverFlowException{
        if (isFull()){
            throw new QueueOverFlowException("Queue is full");
        }
        data[rear++] = item;
        return true;
    }
    public int remove() throws EmptyQueueException{
        if (front == rear){
            throw new EmptyQueueException("can not remove from empty queue");
        }
        int removedItem = data[front];
        // here we need to shift all the element to left
        for (int i = front; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        return removedItem;
    }

    private boolean isFull(){
        return rear == data.length;
    }

    public void display(){
        for (int i = front; i < rear; i++) {
            if (i != rear - 1){
            System.out.print(data[i] + "<--");

            }
            else {
                System.out.print(data[i]);
            }
        }
        System.out.println();
    }

    public int front() throws EmptyQueueException{
        if (front == 0){
            throw new EmptyQueueException("Queue is empty");

        }
        return data[front];
    }
}

class QueueOverFlowException extends Exception {
    public QueueOverFlowException(String message){
        super(message);
    }
}


class EmptyQueueException extends Exception{

    public EmptyQueueException(String message){
        super(message);
    }
}