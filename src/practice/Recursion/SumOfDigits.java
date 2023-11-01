package practice.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Sum of digits of a Number is : ");
        System.out.println(sumOfDigit(134256));

    }
    static int sumOfDigit(int num){
        if(num == 0){
            return num;
        }
        else {
            // take the last digit
//            int last_digit = num % 10;
//            num /= 10;
//            return last_digit + sumOfDigit(num);

            // we can do the above thing in one line
            return (num % 10) + (sumOfDigit(num / 10));
        }
    }
}
