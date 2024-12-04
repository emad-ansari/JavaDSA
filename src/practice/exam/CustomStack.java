package practice.exam;

import java.util.Arrays;


/*
    Stack is a linear data structure that follows a particular order in which the operations are performed.
    The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that 
    is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.

*/ 
public class CustomStack {
    private int top;
    private int[] arr;
    private final int DEFAULT_CAPACITY;

    public CustomStack() {
        DEFAULT_CAPACITY = 5;
        arr = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int value){
        if (isFull()){
            // double the size and then push the value
            int[] temp = new int[2 * arr.length];
            // copy all the element of old array into new array
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[++top] = value;
    }

    public void pop() throws EmptyStackException{
    
        if (isEmpty()){
            throw new EmptyStackException("can not pop from empty stack");
        }
        top--;
    }
    private boolean isFull(){
        return top == this.arr.length - 1;
    }
    private boolean isEmpty(){
        return this.top == -1;
    }
    public int peek() {
        if (isEmpty()) return -1;
        return this.arr[top];
    }

    public void display(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, top + 1)));
    }
    public static void main(String[] args) throws EmptyStackException {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        stack.pop();
        stack.display();

    }
    
}


class EmptyStackException extends Exception{
    public EmptyStackException(String message) {
        super(message);
    }
}