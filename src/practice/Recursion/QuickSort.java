package practice.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;

        int mid = s + (e - s) / 2;
        while (s <= e){
            while (arr[s] < arr[mid]){
                s++;
            }
            while (arr[e] > arr[mid]){
                e--;
            }
            // once both whi le loop stop it means that we are at the point where we need to swap
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, hi);


    }
}
