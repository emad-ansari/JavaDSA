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
        StackUsingLinkedList list = new StackUsingLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);

        list.display();

        list.pop();
        list.pop();
        list.pop();
        list.pop();

        list.display();

    }
    

}
