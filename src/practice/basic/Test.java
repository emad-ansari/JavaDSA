package practice.basic;

public class Test {
    public static void main(String[] args) {
        int number = 837;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            System.out.println(digit); // Print or use the digit as needed
            number /= 10; // Remove the last digit by integer division
        }
    }
}
