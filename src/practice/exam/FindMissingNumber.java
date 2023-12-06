package practice.exam;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] number = {1, 2,3, 4, 5, 7};
        System.out.println(findMissingNumber(number));

    }
    static int findMissingNumber(int[] number){
        int num = number.length + 1;
        int ExpectedSum = num * (num+ 1) / 2;

        int totalSum  = 0;
        for (int nums: number){
            totalSum += nums;
        }
        return ExpectedSum - totalSum;
    }
}
