package oops.List;

//  solved
//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers2 {
    protected ListNode head = null;
    protected ListNode tail = null;



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse the both list
        ListNode f = reverse(l1);
        ListNode s = reverse(l2);

        ListNode sum = addTwoNumbers1(f, s);

        ListNode ans = reverse(sum);
        return ans;
    }
    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode f = l1;
        ListNode s = l2;

        int sum = 0;
        int carry = 0;
        int value = 0;
        while (f != null && s != null){
            sum = f.val + s.val + carry;
            carry = 0;

            if (sum <= 9){
                ListNode node = new ListNode(sum);
                insertElement(node);
            }
            else {
                // means that sum is > 9
                value = sum % 10;
                carry = 1;
                ListNode node = new ListNode(value);
                insertElement(node);
            }
            f = f.next;
            s = s.next;
        }

        while (f != null){
            sum = f.val + carry;
            carry = 0;
            if (sum <= 9) {
                ListNode node = new ListNode(sum);
                insertElement(node);
            }
            else {
                // means that sum is > 9
                value = sum % 10;
                carry = 1;
                ListNode node = new ListNode(value);
                insertElement(node);
            }
            f = f.next;
        }

        while (s != null){
            sum = s.val + carry;
            carry = 0;
            if (sum <= 9) {
                ListNode node = new ListNode(sum);
                insertElement(node);
            }
            else {
                // means that sum is > 9
                value = sum % 10;
                carry = 1;
                ListNode node = new ListNode(value);
                insertElement(node);
            }
            s = s.next;
        }

        if (carry != 0){
            ListNode node = new ListNode(carry);
            insertElement(node);
        }
        return head;

    }
    private void insertElement(ListNode node){
        if (head == null && tail == null){
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
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
