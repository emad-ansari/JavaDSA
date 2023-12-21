package practice.Leetcode;

public class CountPaires {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        System.out.println(count(arr, 2));

    }
    static int count(int[] nums, int k){
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                if (diff == k){
                    count++;
                }
            }
        }
        return count;
    }
}
