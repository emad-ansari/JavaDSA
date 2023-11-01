package practice.basic;

import java.util.Arrays;
// {2, 10, 3, 4, 5,}
public class InsertElement {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = new int[5];
        int position = 2;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1 ){
                continue;
            }else {
                arr[i]  = i + 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length  -1; i >= position - 1 ; i--) {
            if (i ==  position - 1){
                arr[i] = num;
            }
            else{
                arr[i] = arr[i -1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
