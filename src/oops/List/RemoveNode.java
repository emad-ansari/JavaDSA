package oops.List;
//https://leetcode.com/problems/remove-nodes-from-linked-list/
public class RemoveNode {

    public ListNode removeNodes(ListNode head) {
        if (head.next == null){
            return head;
        }

        ListNode reverseHead =  reverse(head);

        ListNode current = reverseHead;
        ListNode next = current.next;
        while (next != null){
            if (current.val > next.val){
                next = next.next;
                current.next = next;
            }
            else {
                next = next.next;
                current = current.next;
            }
        }
        return reverse(reverseHead);

    }

    private ListNode reverse(ListNode head){
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
