package practice.exam;

public class SumOfDigitUsingTailRecursion {
    public static void main(String[] args) {
        System.out.println("Sum of digits: " + find_digit_sum(12345, 0 ));

    }
//Write a java program to find sum of digits of an integer using tail recursion.

    static int find_digit_sum(int n, int sum){
        if (n == 0){
            return sum;
        }
        sum += n % 10;
        return find_digit_sum(n / 10, sum);
    }
}
