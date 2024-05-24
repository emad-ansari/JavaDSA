package practice.Leetcode;

// https://leetcode.com/problems/merge-two-sorted-lists/
//SOLVED

public class MergeTwoList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
//        public void insertLast(int value){
//            if(tail == null){
//                //it means that there is no element in the linkedList
//                insertFirst(value);
//                return;
//            }
//            CustomLinkedList.Node node = new CustomLinkedList.Node(value);
//            tail.next = node;
//            tail = node;
//            size++;
//        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if (list1 == null && list2 == null){
            return list1;
        }
        if (list1 == null && list2 != null){
            return list2;
        }
        if(list2 == null && list1 != null){
            return list1;
        }
        ListNode ans = new ListNode(); // ans will be head of merged linkedList
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode temp = ans;

        while (head1 != null && head2 != null){
            if (head1.val <= head2.val){
                ListNode val1 = new ListNode(head1.val);
                constructList(ans, val1);
                head1 = head1.next;
            }
            if(head1 != null  && head2.val < head1.val){
                ListNode val2 = new ListNode(head2.val);
                constructList(ans, val2);
                head2 = head2.next;
            }
        }

        // check if list1 is remaining
        while (head1 != null){
            ListNode val1 = new ListNode(head1.val);
            constructList(ans, val1);
            head1 = head1.next;
        }
        // check if list2 is remaining
        while (head2 != null){
            ListNode val2 = new ListNode(head2.val);
            constructList(ans, val2);
            head2 = head2.next;
        }

        return ans.next;
    }

    private void constructList(ListNode head, ListNode newNode){
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
