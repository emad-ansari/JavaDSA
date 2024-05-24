package practice.Leetcode;

import java.util.ArrayList;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3,  4, 5, 6, 7, 8, 9}; // arr[i] == i + 1
        System.out.println("Missing Number in array is: " + findMissingNumber2(nums, 2));
        // [0, 0, 1,1, 4, 5, 6, 7, 8, 0, 0]
    }
    public static int findMissingNumber(int[] arr){
        int sumOfArrayElement = 0;
        for (int num: arr){
            sumOfArrayElement += num;
        }
        int n = arr.length + 1;
        int sum_of_n_numbers = (n * (n + 1)) / 2;
        return sum_of_n_numbers - sumOfArrayElement;


    }
    public static ArrayList<Integer> findMissingNumber2(int[] arr, int k) {

        ArrayList<Integer> missingNumber =  new ArrayList<>();
        int [] indexing = new int[arr.length + k + 1];

        for (int j : arr) {
            indexing[j] = 1;

        }
        for (int i = 1; i < indexing.length; i++) {
            if(indexing[i] == 0){
                missingNumber.add(i);
            }

        }
        return missingNumber;
    }

}
