package practice.Leetcode;

public class CountEven {
    public static void main(String[] args) {

        System.out.println(countEven(30));
    }
    static int countEven(int num){
        int digits = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            digits = (int)Math.log10(num) + 1;
            if (digits == 1){
                if (i % 2 == 0){
                    count++;
                }

            }
            else {
                if (isDigitsSumEven(i)){
                    count++;
                }

            }
        }
        return count;
    }
    static boolean isDigitsSumEven(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum % 2 == 0;

    }
}
