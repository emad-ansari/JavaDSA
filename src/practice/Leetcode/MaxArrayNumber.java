package practice.Leetcode;

public class MaxArrayNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {8, 10, 1}
        };
        retMaxNum(arr);

    }

    static int retMaxNum(int[][] arr){
        int sum = 0;
        int maxWealth = 0;
        for (int[] item: arr){
            for (int j : item) {
                sum += j;
            }
            if (sum > maxWealth){
                maxWealth = sum;
            }
            sum  = 0;


        }
        return maxWealth;

    }
}
