package practice.Leetcode;

import java.util.Stack;

//https://leetcode.com/problems/string-to-integer-atoi/
// SOLVED
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));


    }

    public static int myAtoi(String s) {
        // removing leading whitespace
        s = s.stripLeading();
        if (s.isEmpty()){
            return 0;
        }

        // check if the next character is -/+
        int ans = 0, i = 0;
        boolean negative = s.charAt(0) == '-';
        boolean positive = s.charAt(0) == '+';
        if (negative || positive) {
            i++;
        }
        // read each character
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            // check edge cases
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)  ){
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            }
            ans = ans * 10 + digit;
            i++;
        }
        return negative ? -ans : ans;
    }




}
