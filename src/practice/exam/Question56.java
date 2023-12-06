package practice.exam;

import java.util.Arrays;

public class Question56 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        sortBinaryNumber(arr);
        System.out.println(Arrays.toString(arr));

    }

//     Write a Java program to sort a binary array in linear time.
    static void sortBinaryNumber(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            if (arr[i] == 0){
                i++;
            }
            else if (arr[j] == 1){
                j--;
            }
            else if (arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
