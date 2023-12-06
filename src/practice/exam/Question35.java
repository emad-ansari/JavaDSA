package practice.exam;

import java.util.ArrayList;

public class Question35 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(findTwoSum(arr, 6));

    }
    static ArrayList<Integer> findTwoSum(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }

        return ans;
    }
}
