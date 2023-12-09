package practice.exam;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 32, 27, 31, 8, 11};
//        selection(arr);
        selectionWithRec(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - i - 1];
            arr[arr.length - i - 1]  = temp;
        }
    }

    // selection sort with recursion
    static void selectionWithRec(int[] arr, int row, int col, int max){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[max]){
                selectionWithRec(arr, row, col + 1, col);
            }
            else {
                selectionWithRec(arr, row, col + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row -1];
            arr[row - 1] = temp;
            selectionWithRec(arr, row - 1, 0, 0);
        }

    }
}
