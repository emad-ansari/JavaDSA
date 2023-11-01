package practice.searchingalgorithm;
import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35,45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        System.out.println(Arrays.toString(findTarget(arr, 49)));


    }
    static int[] findTarget(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length - 1;
        while(row < arr.length && col >= 0){
            int element =  arr[row][col];

            if(element == target){
                return new int[]{row , col};
            }
            if(element > target){
                col--;
            }
            else {
                row ++;
            }
        }
        return new int[]{-1, -1};
    }
}
