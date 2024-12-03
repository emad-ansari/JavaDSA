package practice.exam;

public class CustomDoublyLinkedList {
    private Node head;
    private int size;
    private class Node {
        private int value;
        Node next;
        Node prev;

        private Node(int value){
            this.value = value;
        }
    }

    public CustomDoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.prev = null;
        newNode.next = head;

        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (this.head == null){
            return;
        }
        Node last = head;

        while (last.next != null){
            last = last.next;
        }

        newNode.next = null;
        newNode.prev = last;
        last.next = newNode;
        size++;
    }

    public void insert(int value, int index){
        Node newNode = new Node(value);
        if (head == null){return;}
        if (index > this.size) {
            System.out.println("Invalid Position!!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
        size++;

    }

    public int getSize(){
        return size;
    }


    public void remove(int key){

        if (head == null) return;

        if (head.value == key){
            head = head.next;
            head.prev = null;
            size--;
        }

        Node node = head;
        while (node != null){
            if (node.value == key){
                Node prevNode = node.prev;
                prevNode.next = node.next;
                if (node.next != null){
                    node.next.prev = prevNode;
                } 
                size--;
                return ;
            }
            node = node.next;
        }

    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("NULL");
    }
}
