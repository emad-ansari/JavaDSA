package practice.exam;

public class CicularQueueUsingLinkedList {
    private Node front, rear;
    // basically here concept of circular linked list will use. only the operation of addiion and removal will be of  queue
    // front is like a head and rear is like a tail.
    CicularQueueUsingLinkedList() {
        this.front = this.rear = null;
    } 
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value= value;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);

        if (front == null && rear == null){
            // means that queue is empty so we are going to add first element
            front = newNode;
            newNode.next = front;
            rear = newNode;
           
        }
        else {
            newNode.next = front;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void remove(){
        if (front == null ) {
            System.out.println("Can not remove from empty queue");
            return;
        }
        if (front == rear){
            front = rear = null;
            return;
        }
        rear.next = front.next;
        front = front.next;
    }


    public void display() {
        Node node = front;
        if (node == null) return;

        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while(node != front);
        System.out.println("Start");
    }

    public static void main(String[] args) {
        CicularQueueUsingLinkedList queue = new CicularQueueUsingLinkedList();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        queue.remove();
        queue.remove();
        queue.display();
    }
    
}
