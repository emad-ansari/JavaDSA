package practice.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sinkingSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sinkingSort(int[] arr){
        boolean Swap = false;
        for (int i = 0; i < arr.length; i++){

            for (int j = 1; j <= arr.length - i - 1; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j , j-1);
                    Swap = true;
                }
            }
            // if Swap is false it means that array is sorted
            // then just break the loop
            if(!Swap){
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
