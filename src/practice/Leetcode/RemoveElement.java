package practice.Leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/remove-element/submissions/ 14-10-23
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));

    }
    static int removeElement(int[] nums, int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        return count;
    }

}
