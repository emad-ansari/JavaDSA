package practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            int lastIndex = arr.length - i -1;
            int maxIndex = findMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }

    }
    // we will make another function to find the maximum element for each iteration
    static int findMax(int[] arr, int start , int end){
        int maxIndex = 0;
        for (int i = start; i <= end ; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
