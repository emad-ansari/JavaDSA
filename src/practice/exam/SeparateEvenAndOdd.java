package practice.exam;

import java.util.Arrays;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        SEPARATE_EVEN_AND_ODD(arr);
        System.out.println(Arrays.toString(arr));

    }
//     Question Number 52
//    Write a Java program that separates 0s on the left hand side and 1s on the right hand side from a random array of 0s and 1.

    static void SEPARATE_EVEN_AND_ODD(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 != 0){
                int j = i + 1;
                while (j < arr.length && arr[j] % 2 != 0 ) {

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
