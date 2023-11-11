package oops.List;
//https://leetcode.com/problems/reorder-list/
// solved
public class ReorderList {
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




    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
