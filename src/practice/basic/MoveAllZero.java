package practice.basic;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4 ,0, 0, 0, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            if (arr[i] == 0){
                while (j < arr.length && arr[j] == 0  ){
                    j++;
                }
                if (j != arr.length){
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }

            }
        }
    }
}
