package practice.exam;

import java.util.Arrays;

public class InsertionSort {


    private void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0 &&arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    private void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }


    private int[] merge_sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge_two_array(left, right);
    }

    private int[] merge_two_array(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] ans  = new int[left.length+ right.length];

        while (i < left.length &&  j < right.length){
            if (left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }
            else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }



    // Implement the bubble sort with recursion
    private void bubble_sort_with_recursion(int[] arr, int row , int col){

    }




    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};

        InsertionSort sort_array = new InsertionSort();
//        sort_array.bubble_sort(arr);
        System.out.println(Arrays.toString(sort_array.merge_sort(arr)));


    }
}
