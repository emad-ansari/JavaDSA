package oops.List;

public class CycleQuestions {
    static private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

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

    // detect the cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // find the node where cycle starts
    public ListNode findStartingPointOfLoop(ListNode head){
        // Initialize two pointers, slow and fast
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {

            // Move slow pointer by one step
            slow = slow.next;

            // Move fast pointer by two steps
            fast = fast.next.next;

            // Detect loop
            if (slow == fast) {

                // Move slow to head, keep fast at meeting point
                slow = head;

                // Move both one step at a time until they meet
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the meeting node, which is the
                // start of the loop
                return slow;
            }
        }

        // No loop found
        return null;
    }


}
