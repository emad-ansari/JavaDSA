package oops.List;
//https://leetcode.com/problems/rotate-list/
public class RotateList {
//    SOLVED

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        int length = 0;
        ListNode node = head;
        while (node != null){
            length++;
            node = node.next;
        }
        if (k % length == 0){
            return head;
        }
        int n = k % length;
        for (int i = 0; i < n; i++) {
            ListNode prev = head;
            ListNode newHead = prev.next;

            while (newHead.next != null){
                prev = prev.next;
                newHead = newHead.next;
            }
            prev.next = null;
            newHead.next = head;
            head = newHead;
        }
        return head;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
