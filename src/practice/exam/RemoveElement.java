package practice.exam;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2 , 3, 4, 5, 6};
        RemoveItem(arr, arr.length  - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void RemoveItem(int[] arr, int removeIndex){
        for (int i = removeIndex; i < arr.length -1 ; i++) {
            arr[i] = arr[i + 1];
        }


    }
}
