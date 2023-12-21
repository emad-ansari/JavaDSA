package practice.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4,3, 2, 1};
        selectionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr, int last_index){
        if(last_index == 0){
            return;
        }
        int max_index = findMax(arr,0, last_index, 0);
        swap(arr, max_index, last_index);
        // then call the next recursion
        selectionSort(arr, last_index - 1);
    }

    static int findMax(int[] arr,int s,  int e, int max_index){
        //Recursive method to find the max_index

        // add base condition
        if(s > e){
            return max_index;
        }
        if(arr[s] > arr[max_index]){
            return findMax(arr, s + 1, e, s);
        }
        else {
            return findMax(arr, s + 1, e, max_index);

        }
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
