package practice.Leetcode;
// https://leetcode.com/problems/climbing-stairs/

// NOT SOLVED TRY IN FUTURE
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(countSteps(1));

    }

    static int countSteps(int n){
        if (n == 1){
            return 1;
        }
        int first = combination(n, 2);
        int second = combination(n, 1);
        int sum = first + second;
        if (sum % 2 == 0){
            return sum / 2;
        }
        else {
            return (sum /2 )+ 1;
        }
    }
    static double factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    static int combination(int n, int r){
        int numerator = (int)factorial(n);
        int d1 = (int)factorial(n - r);
        int d2 = (int)factorial(r);

        return numerator / (d1 * d2);
    }


}
