package practice.exam;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(n + "th fibonacci number is : " + fib(n));

    }

    public static int fib(int n ){
        if (n <= 1){
            return n;
        }
        return fib(n -1) + fib(n - 2);
    }



    static void fibonacci(int n, int nextTerm, int a, int b ){
        if (n < 2){
            return;
        }
        if (a == 0 && b == 1){
            System.out.println(a);
            System.out.println(b);

        }
        nextTerm = a + b;
        System.out.println(nextTerm);
        a = b;
        b = nextTerm;

        fibonacci(n - 1, nextTerm, a, b);
    }

    static void binarySearch(int[] arr, int target){
        int start = 0;
        

    }





}
