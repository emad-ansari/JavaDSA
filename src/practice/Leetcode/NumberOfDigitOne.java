package practice.Leetcode;
//https://leetcode.com/problems/number-of-digit-one/
public class NumberOfDigitOne {
    public static void main(String[] args) {
        System.out.println(countDigitOne(30000000));

    }
    static  int countDigitOne(int n) {
        int count = 0;
        while (n != 0){
            int currentNumber = n;
            int rem = 0;
            while (currentNumber != 0){
                rem = currentNumber % 10;
                if (rem == 1){
                    count++;
                }
                currentNumber /= 10;
            }
            n--;
        }
        return count;
    }



}
