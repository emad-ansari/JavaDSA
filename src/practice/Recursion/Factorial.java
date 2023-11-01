package practice.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Factorial of given Number is : ");
        System.out.println(findFactorial(15));

    }

    static int findFactorial(int n){
        // add the base condition
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * findFactorial(n - 1);
        }
    }
}
