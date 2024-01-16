package practice.exam;

public class Main {
    public static void main(String[] args) throws EmptyStackException, EmptyQueueException, QueueOverFlowException{
        // CustomLinkedList list = new CustomLinkedList();
        // list.addFront(10);
        // list.addFront(20);
        // list.addFront(30);
        // list.display();
        // list.addEnd(40);
        // list.addEnd(50);
        // list.display();
        // list.insertAfter(60, 10);
        // list.display();
        // list.removeFront();
        // list.display();
        // list.removeEnd();
        // list.display();
        // list.removeByKey(60);
        // list.display();

        // CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        // list.insertFirst(10);
        // list.display();
        // list.insertLast(20);
        // list.display();
        // list.insert(30, 1);
        // list.display();
        // System.out.println(list.getSize());

        // list.remove(30);
        // list.display();

        // CircularLInkedList list = new CircularLInkedList();
        // list.insertFirst(10);
        // list.insertFirst(20);
        // list.insertFirst(30);
        // list.display();
        // list.insert(40, 30);
        // list.display();
        // list.remove(40);
        // list.display();

        // CustomStack stack = new CustomStack();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // stack.push(60);
        // stack.push(70);
        // stack.push(80);
        // stack.push(90);
        // stack.push(110);
        // stack.push(120);
        // stack.push(130);
        // stack.push(140);
        // stack.push(150);
        // stack.display();

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
    

        // stack.display();

        // stack.push(160);
        // stack.push(170);
        // stack.push(180);
        
        // stack.display();

        CircularQueue queue = new         CircularQueue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        // queue.insert(60);
        queue.display();

        System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        queue.display();
    
    }
    
}
