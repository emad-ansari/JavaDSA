package practice.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {- 1, 0};
        System.out.println(Arrays.toString(secondMethod(arr, -1)));
    }
    static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int[] secondMethod(int[] numbers, int target){
        int start = 0;
        int end = numbers.length -1;
        while (start <= end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                return new int[]{start + 1, end + 1};
            }
            if (target < numbers[end]){
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
