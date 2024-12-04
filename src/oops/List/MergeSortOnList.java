package oops.List;

public class MergeSortOnList {
    static public class Node {
        int data;
        Node next;
        public Node (int val) {
            this.data = val;
            this.next = null;
        }
    }
    static Node split(Node head) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer two steps and slow pointer
        // one step until fast reaches the end
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }

        // Split the list into two halves
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    // Function to merge two sorted singly linked lists
    static Node merge(Node first, Node second) {

        // If either list is empty, return the other list
        if (first == null) return second;
        if (second == null) return first;

        // Pick the smaller value between first and second nodes
        if (first.data < second.data) {

            // Recursively merge the rest of the lists and
            // link the result to the current node
            first.next = merge(first.next, second);
            return first;
        }
        else {
            // Recursively merge the rest of the lists
            // and link the result to the current node
            second.next = merge(first, second.next);
            return second;
        }
    }

    // Function to perform merge sort on a singly linked list
    static Node mergeSort(Node head) {

        // Base case: if the list is empty or has only one node,
        // it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        Node second = split(head);

        // Recursively sort each half
        head = mergeSort(head);
        second = mergeSort(second);

        // Merge the two sorted halves
        return merge(head, second);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a hard-coded singly linked list:
        // 9 -> 8 -> 5 -> 2
        Node head = new Node(9);
        head.next = new Node(8);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);

        head = mergeSort(head);
        printList(head);
    }

}
