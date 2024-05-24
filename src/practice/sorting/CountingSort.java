package practice.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 3, 9, 4, 4, 1};
        System.out.println("Before Sorting array : " +  Arrays.toString(arr));
        counting_sort(arr);
        System.out.println("After Sorting array: " + Arrays.toString(arr));

    }

    public static void counting_sort(int[] arr){
        int max = findMax(arr);
        int[] output  = new int[arr.length];
        int[] frequency = new int[max + 1];
        // 1. find occurrence of each element
        for(int item : arr){
            frequency[item] += 1;
        }
        // 2. Now find the cumulative frequency and store it into frequency array itself
        for(int i = 1; i < frequency.length; i++){
            frequency[i] = frequency[i] + frequency[i - 1];
        }
        // 3. restore the ans in output array
        for (int j : arr) {
            output[frequency[j] - 1] = j;
            frequency[j]--;
        }
        // 4. Now copy the stored element into original array
        System.arraycopy(output, 0, arr, 0, arr.length);

    }

    private static int findMax(int[] nums){
        int maxNum = nums[0];
        for(int item: nums){
            if (item > maxNum){
                maxNum = item;
            }
        }
        return maxNum;
    }
}
