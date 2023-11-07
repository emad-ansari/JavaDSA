package practice.Leetcode;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(isPrime(83));
        System.out.println(countPrimes(5000000));
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

//    https://leetcode.com/problems/count-primes/solutions/
    static int countPrimes(int n) {
        if (n == 0 || n == 1){
            return 0;
        }
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                primeCount++;
            }
        }
        return primeCount;
    }

}
