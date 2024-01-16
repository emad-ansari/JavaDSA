package practice.exam;
/*
    what is circular queue =>
    A Circular Queue is an extended version of a normal queue where the last element of
    the queue is connected to the first element of the queue forming a circle.
    --> In the circular queue element are insert and remove in circular order.

*/

public class CircularQueue {
    private int DEFAULT_SIZE;
    private int[] data;
    private int front , size, end;
    
    public CircularQueue(){
        front = end = size = 0;
        DEFAULT_SIZE = 5;
        this.data = new int[DEFAULT_SIZE];
    }

    public void insert(int item) {
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }
    public  int  remove() throws EmptyQueueException{
        if (isEmpty()){
            throw new EmptyQueueException("Can not remove from empty queue");
        }

        int removedItem = data[front++];
        front = front % data.length;
        size--;
        return removedItem;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull(){
        return  end == data.length;
    }


    public void display(){
        for (int i = front; i < end; i++) {
            System.out.print(data[i] +  " <- ");
        }
        System.out.println("END");
    }
    
}
