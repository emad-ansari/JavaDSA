package practice.exam;

public class CircularLInkedList {
    private int size;
    private Node head;
    CircularLInkedList() {
        size = 0;
    }

    private class Node{
        private Node next;
        private int value;

        Node(int value){
            this.value = value;
        }
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

    public void insert(int value, int after){
        Node newNode = new Node(value);
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node temp = head;
        do {
            if (temp.value == after){
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
                return;
            }

            temp = temp.next;
        }while (temp.next != head);

    }
    

    public void remove(int key){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        do {
            if (node.next.value == key){
                if (node.next == head){
                    node.next = head.next;
                    head = head.next;
                    size--;
                    return;
                }
                Node temp = node.next;
                node.next = temp.next;
                size--;
                return;
            }
            node = node.next;
    
        }while (node != head);
    }


    public void display(){
        Node node = head;
        if (head == null) return;

        do{ 

            System.out.print(node.value + "-->");
            node = node.next;

        }while (node != head);

        System.out.println("START");
    }
    
}
