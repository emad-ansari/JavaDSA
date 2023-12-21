package practice.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/apply-operations-to-an-array/  14-10-23
public class ApplyOperation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1};
        System.out.println(Arrays.toString(applyOperation(arr)));


    }
    static int[] applyOperation(int[] nums){
        if (nums.length == 2 && nums[0] != 0 && nums[1] != 0){
            return nums;
        }
        for (int i = 0; i < nums.length -1; i++) {
            if(nums[i] == nums[i + 1]){
                nums[i] = 2*nums[i];
                nums[i + 1] = 0;
            }

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

        return nums;
    }
}
