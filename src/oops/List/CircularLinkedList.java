package oops.List;



public class CircularLinkedList {
    private Node head;

    private int size;

    public CircularLinkedList(){
        size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;

        }
        newNode.next = head;
        Node last = head;

        do {
            last = last.next;

        }while(last.next != head);

        last.next = newNode;
        head = newNode;
        size++;

    }

    public void insert(int key, int value){
        Node newNode = new Node(value);

        if (head != null){
            Node node = head;
            while (node.next != head){
                if (node.val == key){
                    newNode.next = node.next;
                    node.next = newNode;
                    size++;
                }
            }
        }
        else {
            System.out.println("key not found");
        }
    }


    public void removeFirst(){
    
        head = head.next;
        size--;
    }

    public void remove(int key) {
        Node node = head;
        do {
            node = node.next;
        }
        while(node.next.val != key);

        Node nextNode = node.next;
        node.next = nextNode.next;
        if(nextNode == head) {
            head = nextNode.next;
        }
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        while(temp != head);
        System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();
        list.remove(20);
        list.display();

    }
}
