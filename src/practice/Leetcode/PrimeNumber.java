package practice.Leetcode;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(83));
    }
    // check whether a number is prime or not
    static boolean isPrime(int n){
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
