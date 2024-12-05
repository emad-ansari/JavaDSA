package practice.stack;
import java.util.Stack;
public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        if (mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        mainStack.pop();
    }

    public int top() {
        // if (mainStack.isEmpty()) return -1;
        return mainStack.peek();
    }

    public int getMin() {
        // if (minStack.isEmpty()) return -1;
        return  minStack.peek();
    }
}
