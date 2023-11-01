package practice.Recursion.N_quenes;

import java.util.Arrays;
import java.util.Scanner;

public class NQuene {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of board: ");
        int size = in.nextInt();
        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
    static void nQueens(char[][] board, int r){
        if (r > board.length - 1){
            printQueens(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, r, i)){
                board[r][i] = 'Q';
                nQueens(board, r + 1);
                board[r][i] = 'X';
            }
        }
    }

    static void printQueens(char[][] arr){
        for (char[] row: arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    static boolean isSafe(char[][] arr, int r, int c){
        int row = r;
        int col = c;
        while (row >= 0){
            if(arr[row][c] == 'Q'){
                return false;
            }
            row--;
        }
        row = r;
        while (col < arr.length && row >= 0){
            if(arr[row][col] == 'Q'){
                return false;
            }
            col++;
            row--;
        }
        row = r;
        col = c;
        while (col >= 0 && row >= 0){
            if(arr[row][col] == 'Q'){
                return false;
            }
            col--;
            row--;
        }
        return true;
    }
}
