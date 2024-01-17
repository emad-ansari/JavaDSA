package practice.exam;

public class QueueUsingLikedList {
    // here front will act as a head and Rear will act as a tail.
    private Node front, rear;
 

    private class Node {
        private int item;
        Node next;

        private Node(int item) {
            this.item = item;
        }
    }

    public void insert(int item){
        Node newNode = new Node(item);

        if (front == null && rear == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void remove(){
        if (front == null){
            System.out.println("Can not delete from empty Queue");
            return;
        }
        front = front.next;
    }

    public void display(){
        Node node = front;
        while (node != null){
            System.out.print(node.item + " -> ");
            node = node.next;
            
        }
        System.out.println("NULL");

    }
    public static void main(String[] args) {
        QueueUsingLikedList list = new QueueUsingLikedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        list.remove();
        list.remove();
        list.remove();
        list.remove();

        list.display();

    }
    

}
