package oops.List;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// SOLVED
public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode middleNode = findMiddleNode(head);
        ListNode temp = head;
        if(temp.next == null){
            //means that size is 1
            head = head.next;
            return head;
        }
        while (temp.next != middleNode){
            temp = temp.next;
        }
        temp.next = middleNode.next;
        return head;
    }
    private ListNode findMiddleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }




      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
