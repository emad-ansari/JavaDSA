package practice.Leetcode;

import java.util.Arrays;

class CountElement {
    public static void main(String[] args) {
        
        int[] arr = {11,7,2,15};
        System.out.println(countElements1(arr));
    }

    public static int countElements(int[] nums){
        if (nums.length == 1 || nums.length == 2){
            return -1;
        }
        int count = 0;
        for (int item: nums){
            boolean strictGreater = false;
            boolean strictSmaller = false;
            for (int i = 0; i < nums.length; i++) {
                if (item == nums[i]){
                    continue;
                }
                if (nums[i] < item && !strictSmaller){
                    strictSmaller = true;
                }
                if (nums[i] > item && !strictGreater){
                    strictGreater = true;
                }
            }
            if (strictGreater && strictSmaller){
                count++;
            }
        }

        return count;
    }


    public static int countElements1(int[] nums) {
        if (nums.length == 1 || nums.length == 2){
            return -1;
        }
        // first try to sort the nums array
        nums = mergeSort(nums);
        int i  = 1;
        int diffentElement = 0;
        while (i < nums.length -1){
            if (nums[i] != nums[i + 1]){
                diffentElement++;
            }
            i++;
        }
        if (diffentElement + 1 == nums.length){
            return nums.length - 2;
        }
         
        return -1;
    }
    private static int[] mergeSort(int[] nums){
        if (nums.length == 1){
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    } 
    private static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                ans[k] = left[i];
                i++;
            }
            else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }


    
}