package practice.basic;

import java.util.Arrays;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {8, 6, 4},
                {4, 5, 6}
        };
        displayUpperTriangular(matrix);
        for (int[] row: matrix){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println(findSum(matrix));
    }


    // Program to display the Upper triangular matrix
    static void displayUpperTriangular(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row > col && row != col){
                    arr[row][col] = 0;
                }
            }
        }
    }

//    6 Write a Program to find the sum of an upper
//    triangular matrix.

    static int findSum(int[][] matrix){
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col >= row){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }
}

