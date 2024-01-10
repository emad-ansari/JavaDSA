package practice.Leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(find(arr, 1));
    }



    static List<Integer> find(int[] nums, int target){
        List<Integer> ans = new ArrayList<>();  
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int targetStart = -1;
        while (start <= end){
            int mid = start + (end - start) / 2; 
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                while (mid >= 0 && nums[mid] == target){
                    mid--;
                }
                targetStart = mid + 1;
                break;
            }
        }
        if (targetStart >= 0){
            while (targetStart < nums.length && nums[targetStart] == target){
                ans.add(targetStart);
                targetStart++;
            }
        }
        return ans;
    }
    
}

