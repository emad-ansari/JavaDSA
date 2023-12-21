package oops.List;

public class RemoveDuplicates {


    public ListNode swapPairs1(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode next = current.next;
        // current = next.next;
        //  and next = current.next;

        while (next != null){
            int temp = current.val;
            current.val = next.val;
            next.val = temp;

            current = next.next;
            if (current == null){
                next = next.next;
            }
            else {
                next = current.next;
            }
        }

        return head;
    }

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while (next != null){
            if (current == head){
                current.next = next.next;
                next.next = current;
            }
            if (next.next == null){
                prev.next = next;
                next.next = current;
                current.next = null;
            }
            else {
                prev.next = next;
                current.next = next.next;
                next.next = current;
            }

            prev = current;
            current = current.next;
            if (current != null){
                next = current.next;
            }
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
