package practice.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 4, 1, 2, 0, 8, 6, 7, 10, 9};
//        cyclicSort(arr);
        cyclicSort1(arr);
        System.out.println(Arrays.toString(arr));


    }
    // this will only work for number from  1 to N
    static void cyclicSort(int[] arr){
        int current_index = 0;
        while (current_index < arr.length){
            if(arr[current_index] != current_index + 1){
                swap(arr, current_index, arr[current_index] - 1);
            }
            else {
                current_index++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    // perform the cyclic sort for an array of number from 0 to N
    static void cyclicSort1(int[] arr){
        int current_index = 0;
        while (current_index < arr.length){
            if(arr[current_index] != current_index){
                swap(arr, current_index, arr[current_index]);
            }
            else {
                current_index ++;
            }
        }
    }
}

