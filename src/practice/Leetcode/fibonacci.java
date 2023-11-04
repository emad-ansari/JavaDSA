package practice.Leetcode;
//https://leetcode.com/problems/fibonacci-number/
// try to solve with for loop
public class fibonacci {
    public static void main(String[] args) {

//        System.out.println(fib(30));

//        printFib(8);
        System.out.println(findNthFib(5));
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

    static void printFib(int n){
        int a = 0;
        int b = 1;
        int nextTerm = 0;
        if (n == 1){
            System.out.println(a);
            return;
        }
        if (n == 2){
            System.out.println(a + b);
            return;
        }

        System.out.println(a);
        System.out.println(b);
        while (n - 2 != 0){
            nextTerm = a + b;
            System.out.println(nextTerm);
            a = b;
            b = nextTerm;
            n--;
        }
    }
    public static int fib1(int n){
        int a = 0;
        int b = 1;
        int nextTerm = 0;
        int sum = 0;
        while (n - 2 != 0){
            nextTerm = a + b;
            sum = sum + nextTerm;
            a = b;
            b = nextTerm;
            n--;
        }
        return sum + 1;
    }
    public static int findNthFib(int n){
        int a = 0;
        int b = 1;
        int nextTerm = 0;
        if (n == 0){
            return a;
        }
        if (n == 1){
            return b;
        }

        for (int i = 0; i <= n- 2; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return nextTerm;
    }

}
