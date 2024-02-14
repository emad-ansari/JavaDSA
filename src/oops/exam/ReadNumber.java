package oops.exam;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) throws DuplicateNumberException{
        
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number : 1");
            number[i] = input.nextInt();
            if (isDuplicate(number, number[i], i)){
                throw new DuplicateNumberException("You enterd duplicate number");
            }
        }
    }
    public static boolean isDuplicate(int[] arr, int num, int end) {
        for (int i = end - 1; i >= 0; i--) {
            if (end >= 0 && arr[end] == num){
                return true;
            }
        }
        return false;
    }
}

class DuplicateNumberException extends Exception{
    DuplicateNumberException(String message) {
        super(message);
    }
}