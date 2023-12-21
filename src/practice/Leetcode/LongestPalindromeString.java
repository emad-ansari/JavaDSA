package practice.Leetcode;

import java.util.ArrayList;

public class LongestPalindromeString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));

    }

// It is solved

    static String longestPalindrome(String s){
        if (s.length() == 1){
            return s;
        }
        String longestPal = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() ; j++) {
                String part = s.substring(i, j + 1);
                if (isPalindrome(part)){
                    if (part.length() > longestPal.length()){
                        longestPal = part;
                    }
                }
            }
        }
        return longestPal;
    }


    static boolean isPalindrome(String str){
        if(str.length() == 1){
            return true;
        }
        if(str.length() == 0){
            return false;
        }
        int s = 0;
        int e = str.length() -1 ;
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

}
