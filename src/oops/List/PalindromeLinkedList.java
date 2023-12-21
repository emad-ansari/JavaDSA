package oops.List;
//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        // Now s will point to middle element so reverse the list from middle to end

        ListNode mid = reverse(s);
        ListNode first = head;
        while (mid != null){
            if (first.val != mid.val){
                break;
            }
            else {
                first = first.next;
                mid = mid.next;
            }
        }
        // Now reverse again reverse the list from middle to end so that it become as it was initially
        head = reverse(s);

        return first == null || mid == null;
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
