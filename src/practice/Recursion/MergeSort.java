package practice.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(mergeSort(arr)));

        System.out.println(Arrays.toString(merge_sort(arr)));
    }

    static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }
        int mid  = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);


    }

    static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int ans_index = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[ans_index] = left[i];
                i++;
            }
            else {
                ans[ans_index] = right[j];
                j++;
            }
            ans_index++;
        }
        // add the remaining element


        while(j < right.length){

            // it means that right array has some element remaining which are not added to ans,
            // then add them to ans
            ans[ans_index] = right[j];
            j++;
            ans_index++;


        }
        while(i < left.length){

            // left element has some element remaining which are not added to ans ,
            // then add them to ans

            ans[ans_index] = left[i];
            i++;
            ans_index++;

        }

        return ans;

    }



    static int[] merge_sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

        // now I have left part of the array and right part of the array
        // so, I can just merge them.
        return mergeArray(left, right);

    }

    static int[] mergeArray(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
            }
            else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        // we merge the arr1 and arr2
        // but, it may be possible that any one of the array is not completed

        // so we have to add the remaining element to my ans array
        while (i < arr1.length){
            ans[k] = arr1[i];
            i ++ ;
            k++;
        }
        while (j < arr1.length){
            ans[k] = arr1[j];
            j ++ ;
            k++;
        }
        return ans;
    }
}
