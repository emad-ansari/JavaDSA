package practice.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Reverse of Number is : ");
        System.out.println(rev2(1234));

    }
    static void reverseNumber(int n, int ans){
        // base condition
        if(n == 0){
            System.out.println(ans);
            return ;
        }
        else {
            reverseNumber(n / 10, ((ans * 10 ) + n % 10));
        }
    }


    static int rev2(int n){
        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digit){
        if(n % 10 == n){
            return n;
        }
        else {
            int rem = n % 10;
            return  rem * (int)Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
        }
    }
}
