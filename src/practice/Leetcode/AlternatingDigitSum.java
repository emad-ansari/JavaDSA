package practice.Leetcode;

import com.sun.source.tree.ClassTree;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigitSum(n));

    }
    static int alternateDigitSum(int n){
        int sum  = 0;
        int countDigits = 0;
        while (n != 0){
            countDigits = (int)Math.log10(n) + 1;
            int lastDigit = n % 10;
            if(countDigits % 2 == 0){
                lastDigit = lastDigit*(-1);
            }
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
}
