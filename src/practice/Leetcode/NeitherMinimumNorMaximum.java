package practice.Leetcode;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3};
        System.out.println(findNonMinOrMax(arr));

    }
    public static int findNonMinOrMax(int[] nums) {
        if (nums.length == 1 || nums.length == 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num: nums){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        for (int item: nums){
            if (item != max && item != min){
                return item;
            }
        }
        return -1;
    }
}
