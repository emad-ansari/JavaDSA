package practice.Leetcode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,3,2,5};
//        System.out.println(singleNumber3(arr));

    }
    static int singleNumber(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);
        // now  nums has been sorted {1, 1 ,2, 2, 4}
        for (int i = 0; i < nums.length - 1; i+= 2) {
            if (nums[i] != nums[i + 1] ){
                return  nums[i];
            }
        }
        return nums[nums.length - 1];
    }

//    static int[] singleNumber3(int[] nums){
//        if (nums.length == 2){
//            return nums;
//        }
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0){
//
//
//            }
//
//        }
//
//    }
}
