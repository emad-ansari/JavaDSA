package practice;

import oops.CustomArrayList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        size = 0;
    }
    // implement insertFirst
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next  = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    // Insert at last
    public void insertLast(int value){
        if(tail == null){
            //it means that there is no element in list
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size - 1){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while(index != 1){
            temp = temp.next;
            index--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteByKey(int key){
        Node temp = head;
        if (temp != null){
            if(temp.val == key){
                head = head.next;
                size--;
                return;
            }
            while (temp.next != null){
                if(temp.next.val == key){
                    Node node = temp.next;
                    temp.next = node.next;
                }else {
                    temp = temp.next;
                }
            }
            size--;
        }
    }
    public int length(){
        return size;
    }
    public int get(int index){
        if (size == 0){
            // it means that there is no element in the list
            return -1;
        }
        Node temp = head;
        while(index != 0){
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    public void reverseList(){
        Node first = head;
        Node last = head;

        while (last.next != null){
            last = last.next;
        }



    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node {
        private int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
