package practice.basic;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        for (int i = 0; i < k % arr.length; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 0 ; j--) {
                if (j == 0){
                    arr[j] = last;
                }else {
                    arr[j] = arr[j - 1];
                }
            }
        }
    }
}
