package oops.List;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public CircularLinkedList(){
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head == null ){
            tail = node;
            head = node;
        }
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int after, int value){
         Node node = new Node(value);
         Node temp = head;
         while (temp != tail){
             if(temp.val == after){
                 //then I have to insert the element
                 node.next = temp.next;
                 temp.next = node;
                 size++;
                 return;
             }else{
                 temp = temp.next;
             }
         }
         if(temp.val == after){
             // it means that I have to inset the value after tail
             // so here it is same as inserting first element
             insertFirst(value);
         }
    }


    public void removeFirst(){
        tail.next = head.next;
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
