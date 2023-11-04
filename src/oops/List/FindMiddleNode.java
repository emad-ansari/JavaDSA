package oops.List;
//https://leetcode.com/problems/middle-of-the-linked-list/
// SOLVED

public class FindMiddleNode {


    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        // now I have length of listNode
        ListNode node = head;
        for (int i = 0; i < length/2; i++) {
            node = node.next;
        }
        return node;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
