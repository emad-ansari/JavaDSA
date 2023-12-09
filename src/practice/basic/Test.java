package practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       for (int[] row: arr){
           for (int item: row){
               System.out.println(item + " ");
           }
       }


        System.out.println(fun(95));

    }
    static int fun(int n){
        if (n > 100){
            return n - 10;
        }
        else {
            return fun(fun(n + 11));
        }
    }



}
