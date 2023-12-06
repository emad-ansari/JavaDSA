package practice.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceSpecificElement {
    public static void main(String[] args) {
        int[] arr = {1, 2,3 ,4, 5, 6, 7, 8, 9, 10};
        replace_element(arr, 5, 11);
        System.out.println(Arrays.toString(arr));

        replace_element(arr, 11, 12);
        System.out.println(Arrays.toString(arr));

        replace_element(arr, 12, 13);
        System.out.println(Arrays.toString(arr));

    }
//    Write a Java program to replace a specific element with another element in array each time.
    static void replace_element(int[] arr, int oldNum, int newNum){
        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum){
                arr[i] = newNum;
                isFind = true;
            }
            if (isFind){
                break;
            }
        }
    }

}
