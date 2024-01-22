package practice.exam;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 32, 27, 31, 8, 11};
        bubbleWithRecursion(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap  = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]  = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }


    // solve the bubble sort with recursion
    static void bubbleWithRecursion(int[] arr, int row, int col){

        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleWithRecursion(arr, row, col +  1);
        }
        else {
            bubbleWithRecursion(arr, row - 1, 0);
        }
    }
}
