package practice.Leetcode;

import java.util.List;

public class MergeSortedList {

//    Merge two list using merge sort

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode f = list1;
//        ListNode s = list2;
//        ListNode ans = new ListNode();
//        while (f != null && s != null){
//            if (f.val < s.val){
//
//            }
//        }
//
//
//    }

    private ListNode getMid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
