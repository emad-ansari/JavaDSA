package practice.exam;

import java.util.Arrays;

public class MoveDuplicateAtStart {
    public static void main(String[] args) {
        int[] arr= {10, 20, 10, 30, 40 ,10};
        Move_duplicate_at_start(arr ,10);
        System.out.println(Arrays.toString(arr));

    }
    static void Move_duplicate_at_start(int[] arr, int duplicate){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != duplicate){
                int j = i + 1;
                while (j < arr.length && arr[j] != duplicate){
                    j++;
                }
                if (j == arr.length){
                    return;
                }
                else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
