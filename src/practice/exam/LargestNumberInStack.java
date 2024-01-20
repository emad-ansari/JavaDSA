package practice.exam;

import java.util.Stack;

public class LargestNumberInStack {
    public static int findLargestNumber(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int num : stack) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>();

        // Push some numbers onto the stack
        numberStack.push(10);
        numberStack.push(5);
        numberStack.push(20);
        numberStack.push(15);

        // Find the largest number in the stack
        int result = findLargestNumber(numberStack);

        if (result != -1) {
            System.out.println("The largest number in the stack is: " + result);
        }
    }
}
