package practice.basic;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        // you have given an array and you have to find the first and last poistion of an element 
        int[] arr = {5, 7, 7, 8, 8 , 10}; // ans --> {1, 4}
        System.out.println(Arrays.toString(findPosition(arr, 8)));

    }
    static int[] findPosition(int[] arr, int target){
        int[] ans = {-1 , -1};
        ans[0] = findFirstAndLastPosition(arr, target, true);
        ans[1] = findFirstAndLastPosition(arr, target, false);

        return ans;
    }

    static int findFirstAndLastPosition(int[] nums,  int target, boolean findFirstIndex){
        int ans =  -1;

        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid -1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findFirstIndex){
                    end = mid -1;
                }
                else {
                    start = mid  + 1;
                }
            }
        }
        return ans;
    }
}
