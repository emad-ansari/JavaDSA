package practice.Leetcode;
// https://leetcode.com/problems/subsets-ii/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
        System.out.println(subsetsWithDup(arr));
    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        int end = 0;
        outer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            if (i > 0 && nums[i] == nums[i - 1]){
                start = end + 1;
            }

            end = outer.size() -1;
            int n = outer.size();

            for (int j = start; j < n ; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
