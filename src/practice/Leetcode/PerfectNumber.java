package practice.Leetcode;
//https://leetcode.com/problems/perfect-number/
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(7));
    }

    static  boolean checkPerfectNumber(int num) {
        int sumOfDivisor = 0;

        for (int i = 1; i <= num / 2 ; i++) {
            if (num % i == 0){
                sumOfDivisor =  sumOfDivisor + i;
            }
        }
        return sumOfDivisor == num;
    }

}

