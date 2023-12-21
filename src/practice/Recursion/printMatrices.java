package practice.Recursion;

import java.util.Arrays;

public class printMatrices {
    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        printPath(0, 0, "", arr, 1);
    }

    static void printPath(int r, int c, String path, int[][] arr, int step){
        if (r == 2 && c == 2){
            arr[r][c] = step;
            for (int[] items: arr){
                System.out.println(Arrays.toString(items));
            }
            System.out.println(path);
            arr[r][c] = 0;
            System.out.println();
            return;
        }

        if ( r > 0  && arr[r - 1][c] == 0){
            arr[r][c] = step;
            printPath(r - 1, c, path + "U", arr, step + 1);
        }
        if ( c > 0 && arr[r][c - 1] == 0){
            arr[r][c] = step;
           printPath(r, c - 1, path + "L", arr,step + 1);
        }
        if ( r < 2 && arr[r + 1][c] == 0){
            arr[r][c] = step;
           printPath(r + 1, c , path + "D", arr,step + 1);
        }
        if (c < 2 && arr[r][c + 1] == 0){
            arr[r][c] = step;
           printPath(r , c + 1, path + "R", arr, step + 1);
        }

        arr[r][c] = 0; // when you are going back make sure you mark the cell as unvisited.
    }
}
