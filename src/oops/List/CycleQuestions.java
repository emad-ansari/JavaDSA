package oops.List;

public class CycleQuestions {

    // find the length of cycle
    public static int findCycleLength(ListNode list){
        ListNode fast = list;
        ListNode slow = list;
        int count = 0;
        while (fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        do {
            slow = slow.next;
            count++;
        }while(slow != fast);
        return count;
    }

    // find the node where cycle starts
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while (fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do {
                    slow = slow.next;
                    length++;
                }while (slow != fast);
                break;
            }
        }
        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }

        // now run the both f and s till they reach at same node
        while (f != s){
            s = s.next;
            f = f.next;
        }
        return s;
    }

    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
