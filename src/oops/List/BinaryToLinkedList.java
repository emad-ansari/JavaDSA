package oops.List;

public class BinaryToLinkedList {
    public int getDecimalValue(ListNode head) {
        if (head.next == null){
            return head.val;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int ans = 0;
        int i = length -1;
        ListNode node = head;
        while (node != null){
            ans = ans + node.val*(int)Math.pow(2, i);
            i--;
            node = node.next;
        }
        return ans;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
