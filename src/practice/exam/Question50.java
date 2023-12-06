package practice.exam;

import java.util.Arrays;

public class Question50 {
    public static void main(String[] args) {
        int[] arr = {20, 50, 30, 100, 40, 10, 70, 60, 90, 80};
        question50(arr);
    }
//    Write a Java program to sort an array of positive integers from an array.
//    In the sorted array the value of the first element should be maximum, the second value should be a minimum,
//    third should be the second maximum, the fourth should be the second minimum and so on.



    static void question50(int[] arr){
        int[] sortedArray = sortArray(arr);

        System.out.println(Arrays.toString(sortedArray));
        int[] ans = new int[sortedArray.length];
        int i = 0;
        int j = sortedArray.length - 1;
        int k = 0;
        while (i <= j){
            ans[k++] = sortedArray[j];
            ans[k++] = sortedArray[i];
            i++;
            j--;
        }
        System.out.println("Updated Array : " + Arrays.toString(ans));
    }
    static int[]  sortArray(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(arr, mid, arr.length));
        return  merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                ans[k] = left[i];
                i++;
                k++;
            }
            else {
                ans[k] = right[j];
                j++;
                k++;
            }
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

}
