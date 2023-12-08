package practice.exam;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        fibonacci(50, 0, 0, 1);

    }
    // solve the fibonacci with recursion
//     0, 1, 1, 2, 3, 5, 8, 13,
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





}
