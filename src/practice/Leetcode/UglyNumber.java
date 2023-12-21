package practice.Leetcode;
//https://leetcode.com/problems/ugly-number/description/
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(-2147483648));
//        -2147483648
    }
    public static boolean isUgly(int n) {
//        if (n == Integer.MIN_VALUE || n == Integer.MAX_VALUE){
//            return false;
//        }
//        if (n < 0){
//            n = n * (-1);
//        }
        int i = 2;

        while (i <= Math.abs(n /2)){
            if (n % i == 0){
               if (isPrime(i)){
                   if (i > 5){
                       return false;
                   }
               }
            }
            i++;
        }
        return true;

    }

    static boolean isPrime(long n){
        int c = (int)Math.sqrt(n);
        int i = 2;
        while (i <= c){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

}

