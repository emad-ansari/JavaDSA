package oops.List;

import oops.List.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.display();
        list.removeDuplicate();
        list.display();
//        list.insertLast(10);
//        list.insertLast(12);
//        list.insert(17, 3);
//        list.insert(20, 1);
//        list.display();
//        System.out.println(list.find(list.get(0)));
//        list.insertRec(2, 12, list.find(list.get(0)));
//        list.display();
//
//        list.insert(30, 0);
//        System.out.print("Before removing element: ");
//        list.display();
//
//        System.out.println();
//        list.remove(2);
//        System.out.print("After removing element: ");
//        list.display();
//        System.out.println();
//        //remove first element
//        list.remove(0);
//        System.out.print("Remove first element: ");
//        list.display();
//        System.out.println("Get a particular element");
//        System.out.println(list.get(5));
//
//        list.remove(list.length() -1);
//        System.out.print("Remove last element: ");
//        list.display();

//        DoublyLinkedList list1 = new DoublyLinkedList();
//        list1.insertFirst(10);
//        list1.insertFirst(20);
//        list1.insertFirst(30);
//        list1.insertFirst(40);
//        list1.insertFirst(50);
//        list1.display();
//        list1.insert(3, 100);
//        list1.display();
//        list1.insert(list1.length(), 17);
//        list1.display();
//        list1.remove(50);
//        list1.display();

//        CircularLinkedList list2 = new CircularLinkedList();
//        list2.insertFirst(8);
//        list2.insertFirst(9);
//        list2.insertFirst(2);
//        list2.display();
//        list2.insert(9, 17);
//        list2.display();
//        list2.insert(8, 100);
//        list2.display();
//        list2.removeFirst();
//        list2.display();
//        list2.remove(9);
//        list2.display();

    }
}
