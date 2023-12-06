package practice.exam;

import java.util.Arrays;

public class Seperate0And1 {
    public static void main(String[] args) {
        int[] arr = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1, 0 };
        SEPARATE_0_AND_1(arr);
        System.out.println(Arrays.toString(arr));

    }

//    Write a Java program that separates 0s on the left hand side and 1s on the right hand side from a random array of 0s and 1.

    static void SEPARATE_0_AND_1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int j = i + 1;
                while (j < arr.length && arr[j] != 0) {

                    j++;
                }
                if (j == arr.length){
                    return;
                }
                else {
                    // swap i with j
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
