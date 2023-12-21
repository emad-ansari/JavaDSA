package practice.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/  14-10-23
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);


    }

    static void moveZeroes(int[] nums){
        if (nums.length == 1){
            System.out.println(Arrays.toString(nums));
            return;
        }
        int i = 0;
        int j = 0;
        while (i < nums.length -1  && j < nums.length -1){
            while(nums[i] != 0 && i < nums.length - 1 ){
                i++;
            }
            j = i + 1;
            while(j <= nums.length -1 && nums[j] == 0  ){
                j++;
            }

            if (j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
