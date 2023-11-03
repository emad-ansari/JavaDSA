package practice.Leetcode;
//https://leetcode.com/problems/fibonacci-number/
// try to solve with for loop
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(30));
    }
    static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
