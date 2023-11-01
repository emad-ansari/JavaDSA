package practice.Leetcode;

public class AddDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(addDigits(num));


    }
    static int addDigits(int num){
        if (num == 0){
            return num;
        }
        int digits = (int)Math.log10(num) + 1;
        if (digits == 1){
            return num;
        }

        int sum = 0;

        while (num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return addDigits(sum);
    }

}
