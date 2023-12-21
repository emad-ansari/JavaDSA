package practice.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZeroes(2000000000, 0));

    }

    static  int countZeroes(int num, int count){
        if(num == 0){
            return count;
        }
        int digit = num % 10;
        if(digit == 0){
            return countZeroes(num / 10, count + 1);
        }
        else {
            return countZeroes(num / 10, count);
        }
    }
}
