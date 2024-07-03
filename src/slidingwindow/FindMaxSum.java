package slidingwindow;

import java.util.ArrayList;

public class FindMaxSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 10};

        System.out.println("Subset is: " + findSubsets(arr, 14));

    }

    public static int findMaxSumOfFourConsecutive(int[] arr, int k){
        int l = 0;
        int r = k - 1;
        int sum = 0;
        int maxSum = 0;

        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        while(r < arr.length - 1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }


    // finding max sum <= k and return all subsets

    public static ArrayList<Integer> findSubsets(int[] arr, int k){


        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLength = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (r < arr.length){
            sum = sum + arr[r];
            ans.add(arr[r]);
            while (sum > k){
                sum = sum - arr[l];
                ans.removeFirst();
                l++;
            }
            if(sum <= k){
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;
        }
        System.out.println("Max length is: " + maxLength);
        return ans;
    }
}
