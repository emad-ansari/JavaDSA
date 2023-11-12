package oops.List;

import java.util.List;

// Reverse a single linked list
//https://leetcode.com/problems/reverse-linked-list/
public class ReversList {

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int fc = 0;
        int lc = length -1;
        ListNode first = head;
        while (fc <= lc){
            ListNode last = findLastNode(head, lc);
            int temp1 = first.val;
            first.val = last.val;
            last.val = temp1;
            first = first.next;
            fc++;
            lc--;
        }
        return head;
    }
    private ListNode findLastNode(ListNode head, int end){
        ListNode node = head;
        for(int i = 0; i < end; i++){
            node = node.next;
        }
        return node;
    }

    // Reverse the list with Kunal method
    public ListNode reverse(ListNode head){
        if (head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        // At the end when while loop break, prev will be head of the reverse linked list, so return prev
        return prev;
    }




    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
