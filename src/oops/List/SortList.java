package oops.List;
// https://leetcode.com/problems/sort-list/
import java.util.Arrays;
// SOLVED

public class SortList {
    public ListNode sortList(ListNode head) {
       ListNode temp = head;
       int index = 0;
       int size = findLength(head);
       int[] arr  = new int[size];
       while (temp != null ){
           arr[index]  = temp.val;
           temp = temp.next;
           index++;
       }
        //now sort the array
        Arrays.sort(arr);
        ListNode node = head;
        for (int i = 0; i < size; i++) {
            node.val = arr[i];
            node = node.next;
        }
        return head;
    }

    private int findLength(ListNode head){
        ListNode temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
