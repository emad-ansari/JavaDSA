package oops.List;
//https://leetcode.com/problems/reorder-list/
// solved
public class ReorderList {

    // My method
    public void reorderList(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }

        ListNode node = head;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = node.val;
            node = node.next;
        }
        int i = 0;
        int j = length - 1;
        int position = 0;
        ListNode temp1 = head;
        while (i <= j){
            if (position % 2 == 0){
                temp1.val = arr[i];
                i++;
                temp1 = temp1.next;
            }
            else {
                temp1.val = arr[j];
                j--;
            }
            position++;
        }

    }

    // Reorder the list by kunal method
    // Asked by Google, Facebook
    public void reorder(ListNode head){
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = findMiddleNode(head);
        ListNode headSecond = reverse(mid);
        ListNode headFirst = head;
        while (headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next  = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        // At the end headFirst will be the last node so headFirst.next should point to null if it is not pointing to null
        if (headFirst != null ){
            headFirst.next = null;
        }

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
