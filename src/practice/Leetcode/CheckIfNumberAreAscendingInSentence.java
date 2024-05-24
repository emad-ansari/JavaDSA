package practice.Leetcode;

import java.util.StringTokenizer;

public class CheckIfNumberAreAscendingInSentence {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public static boolean areNumbersAscending(String s){
        StringTokenizer tokens = new StringTokenizer(s);
        int prev = -1, curr = -1;
        while (tokens.hasMoreTokens()){
            String word = tokens.nextToken();
            if (isNumeric(word)){
                curr = Integer. parseInt(word);
                if (!isGreater(prev, curr)){
                    return false;
                }
                prev = curr;
            }
        }

        return true;

    }

    private static boolean isNumeric(String word){
        for (char c: word.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    private static boolean isGreater(int prev, int curr){
        return curr > prev;
    }
}
