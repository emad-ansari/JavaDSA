package practice.exam;

public class StackUsingLinkedList {
    private Node top;
 

    private class Node {
        private int item;
        Node next;
        private Node(int item) {
            this.item = item;
        }
    }

    StackUsingLinkedList() {
        top = null;
    }

    public void push(int item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        
    }

    public void pop(){
        if (top == null){
            System.out.println("Can not delete from empty stack");
            return;
        }
        top = top.next;
    }

    public void display(){
        Node node = top;
        while (node != null){
            System.out.print(node.item + " -> ");
            node = node.next;
            
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackUsingLinkedList list1 = new StackUsingLinkedList();
        list1.push(10);
        list1.push(20);
        list1.push(30);
        list1.push(40);
        list1.push(50);
        list1.push(60);

        // list1.display();

        // list1.pop();
        // list1.pop();
        // list1.pop();
        // list1.pop();

        list1.display();

        StackUsingLinkedList list2 = new StackUsingLinkedList();
        list2.push(60);
        list2.push(50);
        list2.push(40);
        list2.push(30);
        list2.push(20);
        list2.push(10);
        System.out.println("hello");


        list2.display();
    }
    

}
