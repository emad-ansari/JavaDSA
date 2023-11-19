package oops.List;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNode {

    public void deleteNode(ListNode node) {
        reverseList(node);
        ListNode tail = node;
        while (tail.next.next!= null){
            tail = tail.next;
        }
        tail.next = null;
        reverseList(node);
    }
    public void reverseList(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int fc = 0;
        int lc = length -1;
        ListNode first = head;
        while (fc <= lc){
            ListNode last = findLastNode(head, lc);
            int temp1 = first.val;
            first.val = last.val;
            last.val = temp1;
            first = first.next;
            fc++;
            lc--;
        }
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
      ListNode(int x) { val = x; }
    }
}
