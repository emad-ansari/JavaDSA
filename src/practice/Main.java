package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 10, 4, 18};
//        int[] ans = Arrays.copyOfRange(arr, );
//        insertionSort(arr);
//        selectionSort(arr);
//        cyclicSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));

//        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j != 0){
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int lastIndex = arr.length - i -1;
            int maxIndex = findMax(arr, lastIndex);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

    }
    static int findMax(int[] arr, int end){
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void  swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclicSort(int[] arr){
        int index = 0;
        while (index < arr.length){
            if (arr[index] != index + 1 ){
                swap(arr, index, arr[index] -1 );
            }else{
                index++;
            }
        }
    }

    static int[]  mergeSort(int[] arr){
        if (arr.length == 1 || arr.length == 0){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left =  mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second){
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
                k++;
            }else {
                ans[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
