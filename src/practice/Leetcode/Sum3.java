package practice.Leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// NOT PASSED IN LEETCODE

public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};
        System.out.println(threeSum(arr));

    }
    static List<List<Integer>> threeSum(int[] nums){
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
