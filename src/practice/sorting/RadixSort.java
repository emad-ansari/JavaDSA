
package practice.sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {169, 44, 74, 89, 801, 23, 1, 65};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("After Sorting array: " + Arrays.toString(arr));
    }

    public static void radixSort(int[] arr){
        int max = getMax(arr);
        int place = 1;
        while(max / place > 0) {
            counting_sort(arr, place);
            place *= 10;
        }
    }
    private static void counting_sort(int[] arr ,int place){
        int[] output = new int[arr.length];
        int[] count = new int[10]; //count array store the occurrence of digit from 0-9

        for (int item: arr){
            int index = item / place;
            count[index % 10] += 1;
        }
        // calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] = count[i -1 ] + count[i];
        }

        // place the element in sorted order
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int index = arr[i] / place;
            output[count[index % 10] - 1] = arr[i];
            count[index % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public  static int getMax(int[] arr){
        int maxItem = arr[0];
        for(int item: arr){
            if (item > maxItem){
                maxItem =  item;
            }
        }
        return maxItem;
    }
    
}
