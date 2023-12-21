package practice.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 10 , 5, 7, 8};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr, int noOfPass, int index){
        // add base condition

        if(noOfPass == 0){
            return;
        }
        if(index < noOfPass){
            if(arr[index] > arr[index + 1]){
                swap(arr, index, index + 1);
            }
            bubbleSort(arr, noOfPass, index + 1);
        }
        else {
            bubbleSort(arr, noOfPass - 1, 0);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
