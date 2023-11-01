package practice.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/separate-the-digits-in-an-array/description/
public class SeparateDigits {
    public static void main(String[] args) {
        int[] arr = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(arr)));

    }
    static int[] separateDigits(int[] nums){
        int size = 0;
        for (int item: nums){
            while (item != 0){
                item /= 10;
                size++;
            }
        }
        int[] ans = new int[size];
        int index = size -1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            while (nums[i] != 0){
                ans[index] = nums[i] % 10;
                nums[i] /= 10;
                index--;
            }
        }
        return ans;
    }


}
