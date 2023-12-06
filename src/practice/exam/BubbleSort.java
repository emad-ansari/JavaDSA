package practice.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 32, 27, 31, 8, 11};
        bubbleSort(arr);
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
}
