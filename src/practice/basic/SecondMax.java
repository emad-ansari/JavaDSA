package practice.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 1, 0, 1, 2}; // {5, 2, 3, 4, 1, 0, 1, 2};
        System.out.println(countGreat(arr));

    }
    static int secondMax(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int max = -1 ;
        boolean add = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                list.add(i);
                add = true;
            }


        }


        int index = list.size() -1;
        return arr[index];

    }

    public static int countGreat (int[] arr) {


        for (int i = 0;  i < arr.length; i++) {
        int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
