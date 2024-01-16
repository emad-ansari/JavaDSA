package practice.exam;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(){
        head = null;
    }

    private class Node {
        Node next;
        private int value;

        public Node(int value ) {
            this.value = value;
        } 
    }
    

    public void addFront(int value){
        Node newNode  = new Node(value);
        
        if (head == null){
            // it means this is first element that we are going to add
            head = newNode;
            newNode.next =null;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        
    }
    public void addEnd(int value){
        Node newNode =  new Node(value);

        if (head == null){
            // means that this is first element that we are going to insert
            head = newNode;
            newNode.next = null;
        }
        else{

            Node last = head;

            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void insertAfter(int value, int after){
        Node newNode = new Node(value);

        Node afterNode = head;
        while (afterNode != null && afterNode.value != after){
            afterNode = afterNode.next;
        }
        if (afterNode != null){
            newNode.next = afterNode.next;
            afterNode.next = newNode;
        }
        else {
            System.out.println("after node not found");
            return;
        }
    }

    public void removeFront(){
        if (head == null){
            // means that there is no element so 
            System.out.println("there is no element to remove");
        }
        head = head.next;
    }

    public void removeEnd(){
        if (head == null){
            System.out.println("no element to remove");
        }
        if (head.next == null){
            head = head.next;
        }

        Node last = head;
        while (last.next != null && last.next.next != null){
            last = last.next;
        }
        last.next = null;
    }

    public void removeByKey(int key){
        if (head != null){
            Node prevNode = null;
            Node currentNode = head;

            while (currentNode != null && currentNode.value != key){
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            if (currentNode != null){
                prevNode.next = currentNode.next;
            }
            else {
                System.out.println("key no found");
            }
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
