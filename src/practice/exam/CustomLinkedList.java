package practice.exam;


public class CustomLinkedList {
    Node head;
    public CustomLinkedList(){
        head = null;
    }
    static private class Node {
        Node next;
        private int value;

        public Node(int value ) {
            this.value = value;
        } 
    }    
    public int findSecondLargest(CustomLinkedList list) {
        if (list.head == null || list.head.next == null) {
            System.out.println("Linked list doesn't have enough elements.");
            return -1;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        Node current = list.head;
        while (current != null) {
            if (current.value > firstMax) {
                secondMax = firstMax;
                firstMax = current.value;
            } else if (current.value > secondMax && current.value < firstMax) {
                secondMax = current.value;
            }
            current = current.next;
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
            return -1;
        }

        return secondMax;
    }

    public void insertAfter(int value, int after){
        Node newNode = new Node(value);

        Node afterNode = head;
        while (afterNode != null && afterNode.value != after){
            afterNode = afterNode.next;
        }
        if (afterNode != null){
            newNode.next = afterNode.next;
            afterNode.next = newNode;
        }
        else {
            System.out.println("after node not found");
            return;
        }
    }
    public void insertAtPosition(int data, int position) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // Case 1: Insert at the head
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node before the desired position
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        // If position is invalid (greater than the list size)
        if (current == null) {
            System.out.println("Invalid position. Unable to insert.");
            return;
        }

        // Case 2: Insert at the desired position
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeByKey(int key){
        if (head != null){
            Node prevNode = null;
            Node currentNode = head;

            while (currentNode != null && currentNode.value != key){
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            if (currentNode != null && prevNode != null){
                prevNode.next = currentNode.next;
            }
            else {
                System.out.println("key no found");
            }
        }
    }


    public void addFront(int value){
        Node newNode  = new Node(value);
        
        if (head == null){
            // it means this is first element that we are going to add
            head = newNode;
            newNode.next =null;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        
    }
    public void addEnd(int value){
        Node newNode =  new Node(value);

        if (head == null){
            // means that this is first element that we are going to insert
            head = newNode;
            newNode.next = null;
        }
        else{

            Node last = head;

            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void removeFront(){
        if (head == null){
            // means that there is no element so 
            System.out.println("there is no element to remove");
        }
        head = head.next;
    }

    public void removeEnd(){
        if (head == null) {
            System.out.println("Can Not Remove from Empty List.");
            return;
        }
        // if there is only first element.
        if (head.next == null){
            head = null;
            return;
        }

        Node last = head;
        while (last.next != null && last.next.next != null){
            last = last.next;
        }
        last.next = null;
    }

    // public void reverseList(Node slow, Node fast, CustomLinkedList ans ){
        
    //     if (fast == null){
    //         ans.head = slow;
    //         return;
    //     }
    //     reverseList(fast, fast.next, ans);
    //     fast.next = slow;
    // }

    public Node reverseList() {
        if (head == null || head.next == null) {
            return head; // Return the head as is if the list is empty or has only one node
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public CustomLinkedList addTwoList(CustomLinkedList list1 , CustomLinkedList list2) {
        CustomLinkedList ans = new CustomLinkedList();
        Node head1 =  list1.reverseList();
        Node head2 =  list2.reverseList();
        int carry = 0;
        int sum = 0;

        while (head1 != null && head2 != null){
            sum = head1.value + head2.value + carry;
            carry = 0;
            if (sum > 9){
                int val = extractValue(sum, false);
                carry = extractValue(sum, true);
                ans.addEnd(val);
            }
            else {
                ans.addEnd(sum);
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        // check if head1 is null or not if not then add the remaining one
        while (head1 != null){
            if (carry != 0){
                sum = head1.value + carry;
                carry = 0;
                ans.addEnd(sum);
            }
            else {
                ans.addEnd(head1.value);
            }
            head1 = head1.next;
        } 

        while (head2 != null){
            if (carry != 0){
                sum = head2.value + carry;
                carry = 0;
                ans.addEnd(sum);
            }
            else {
                ans.addEnd(head2.value);
            }
            head2 = head2.next;
        } 
        return ans;
    }

    public int extractValue(int number, boolean carry) {

        if (carry){
            number /= 10;
            return number;
        }
        int value = number % 10;
        return value ;
    }

    public void display(Node start){
        Node node = start;
        while (node != null){
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    

    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.addEnd(5);
//        list.addEnd(4);
//        list.addEnd(3);
//        list.addEnd(4);
//        list.addEnd(6);
//        list.addEnd(7);

//        list.display();
//        System.out.println("Second largest element is: " + list.findSecondLargest(list));

         CustomLinkedList list2 = new CustomLinkedList();

         list2.addEnd(4);
         list2.addEnd(8);
         list2.addEnd(3);
         list2.addEnd(1);
         list2.addEnd(5);
         Node reverseListNode = list2.reverseList();
         list2.display(reverseListNode);

        // CustomLinkedList ans = new CustomLinkedList();
        // ans = ans.addTwoList(list, list2);
        // ans.display();

    }

}
