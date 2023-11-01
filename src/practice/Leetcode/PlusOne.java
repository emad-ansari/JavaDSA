package practice.Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));



    }
    static int[] plusOne(int[] digits){

        int lastIndex = digits.length - 1;
        int lastElement = digits[digits.length -1 ] + 1;
        if (checkDigit(lastElement)){
            digits[lastIndex] =  lastElement;
            return digits;

        }
        else {
            // means that lastElement is > 1
            int lastDigit = 0;

            int[] ans = new int[digits.length + 1];
            // first fill the element till digits.length
            int index = 0;
            while (index < digits.length - 1) {
                ans[index] = digits[index];
                index ++;
            }

            // now fill the extra element
            for (int i = ans.length - 1; i >= index ; i--) {
                lastDigit = lastElement % 10;
                ans[i] = lastDigit;
                lastElement = lastElement / 10;

            }

            return ans;
        }

    }
    static boolean checkDigit(int number){
        int digits = (int)Math.log10(number) + 1;

        return digits < 2;
    }


}

