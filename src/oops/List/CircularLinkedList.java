package oops.List;

public class CircularLinkedList {
    private Node head;

    private int size;

    public CircularLinkedList(){
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head == null ){
            head = node;
            node.next = head;
        }
        else{
            
        }
    
    
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
        Node temp = head;
        if (temp == null){
            System.out.println("list is empty");
            return;
        }
        if(key == temp.val){
            // just called the removeFirst
            removeFirst();
            return;
        }
        do{
            if(temp.next.val == key){
                Node node = temp.next;
                temp.next = node.next;
                size--;
                return;
            }
            else {
                temp = temp.next;
            }
        }
        while(temp.next != head);
        System.out.println("Value does not exist");
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
}
