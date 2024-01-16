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
    private int DEFAULT_CAPACITY;

    CustomStack() {
        DEFAULT_CAPACITY = 5;
        arr = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int value){
        if (isFull(arr)){
            // double the size and then push the value
            int[] temp = new int[2 * arr.length];
            // copy all the element of old array into new array
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            arr[++top] = value;
            return;
        }   
        else {
            arr[++top] = value;
        }
    }

    public void pop() throws EmptyStackException{
    
        if (top == -1){
            throw new EmptyStackException("can not pop from empty stack");
        }
        top--;
    }
    private boolean isFull(int[] arr){
        return top == arr.length - 1;
    }

    public void display(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, top + 1)));
    }
    
}


class EmptyStackException extends Exception{
    public EmptyStackException(String message) {
        super(message);
    }
}