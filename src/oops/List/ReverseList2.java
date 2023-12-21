package oops.List;
//https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int fc = left - 1;
        int lc = right - 1;
        ListNode first = findLastNode(head, fc);
        while (fc <= lc){
            ListNode last = findLastNode(head, lc);
            int temp1 = first.val;
            first.val = last.val;
            last.val = temp1;
            first = first.next;
            fc++;
            lc--;
        }
        return head;
    }
    private ListNode findLastNode(ListNode head, int end){
        ListNode node = head;
        for(int i = 0; i < end; i++){
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
