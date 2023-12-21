package practice.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }
    static int removeDuplicates(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int index = 0;
        while (i < nums.length){
            if (i == nums.length -1 && nums[i] != nums[i -1]){
                list.add(nums[i]);
                i++;
                continue;
            }
            if(nums[i] != nums[i + 1]){
                list.add(nums[i]);
                index++;

            }
            i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(j < list.size()){
                nums[j] = list.get(j);
            }else {
                nums[j] = 0;
            }
        }
        return list.size();
    }
}
