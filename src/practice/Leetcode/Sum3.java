package practice.Leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// NOT PASSED IN LEETCODE

public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }

    public static List<List<Integer>> threeSum(int[] nums){
        int[] sortedArray = mergeSort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = sortedArray.length -1;
        while (i <= j){
            int sum = sortedArray[i] + sortedArray[j];
            if (sum <=  0) {
                sum += sortedArray[j-1];
                if (sum == 0){
                    List<Integer> temp  = new ArrayList<>();
                    temp.add(sortedArray[i]);
                    temp.add(sortedArray[j]);
                    temp.add(sortedArray[j -1]);
                    list.add(temp);
                }
                j--;
            } else if (sum > 0) {
                sum += sortedArray[i+1];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(sortedArray[i]);
                    temp.add(sortedArray[i + 1]);
                    temp.add(sortedArray[j]);
                    list.add(temp);
                }
                j--;
            } else if ((i+2) == j) {
                i++;
                j = sortedArray.length -1;
            }
        }
        return list;
    }


    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid  = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int ans_index = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[ans_index] = left[i];
                i++;
            }
            else {
                ans[ans_index] = right[j];
                j++;
            }
            ans_index++;
        }
        while(j < right.length){
            ans[ans_index] = right[j];
            j++;
            ans_index++;
        }
        while(i < left.length){
            ans[ans_index] = left[i];
            i++;
            ans_index++;
        }
        return ans;
    }


































    static List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        for (int i = 0; i <= nums.length -2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        Collections.sort(inner);
                        outer.add(inner);
                    }
                }
            }
        }
        return removeDuplicates(outer);
    }
    static List<List<Integer>> removeDuplicates(List<List<Integer>> outer){
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list: outer){
            if(!ans.contains(list)){
                ans.add(list);
            }
        }
        return ans;
    }




}
